import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Intership {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int problems = Integer.parseInt(reader.readLine());
        int nemes = Integer.parseInt(reader.readLine());

        ArrayDeque<String> stackProblems = new ArrayDeque<>();
        ArrayDeque<String> dequeNames = new ArrayDeque<>();
        List<String> endNames = new ArrayList<>();
        int maxSumStackChar = 0;
        int maxSumQueueChar = 0;

        Pattern pattern = Pattern.compile("[A-Z][-a-z]+ [A-Z][a-z]+");

        String line;

        for (int i = 0; i < problems; i++) {
            line = reader.readLine();
            stackProblems.push(line);


        }
        for (int i = 0; i < nemes; i++) {
            line = reader.readLine();
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {

                dequeNames.add(line);

            }

        }

        while (!stackProblems.isEmpty() && !dequeNames.isEmpty()) {

            String problemi = stackProblems.pop();
            String imena = dequeNames.pop();

            int sumCharStack = 0;
            int sumCharQueue = 0;


            for (int i = 0; i < problemi.length(); i++) {

                sumCharStack += problemi.charAt(i);

            }
            maxSumStackChar = sumCharStack;

            for (int i = 0; i < imena.length(); i++) {

                sumCharQueue = sumCharQueue + imena.charAt(i);

            }

            maxSumQueueChar = sumCharQueue;


            if (maxSumQueueChar >= maxSumStackChar) {
                System.out.printf("%s solved %s.%n", imena, problemi);

                dequeNames.addLast(imena);
                endNames.add(imena);


            } else if (maxSumStackChar >= maxSumQueueChar && dequeNames.size() > 0) {
                System.out.printf("%s failed %s.%n", imena, problemi);
                if (dequeNames.size() > 0) {
                    stackProblems.add(problemi);
                }

            }
            if (dequeNames.size() < 1) {
                System.out.printf("%s gets the job!%n", imena);
                break;
            }


        }
        if (maxSumQueueChar >= maxSumStackChar) {
            String result = String.join(", ", endNames);
            System.out.print(result);
        }


    }


}



