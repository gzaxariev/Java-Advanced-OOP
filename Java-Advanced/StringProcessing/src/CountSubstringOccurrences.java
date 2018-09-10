import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        String info = reader.readLine();
        int counter = 0;

        Pattern pattern =Pattern.compile(info, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){

            counter++;
        }
        System.out.println(counter);



    }
}
