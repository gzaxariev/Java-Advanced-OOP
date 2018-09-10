import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> minerTask = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!minerTask.containsKey(line)) {
                minerTask.put(line, quantity);
            } else {
                minerTask.put(line, minerTask.get(line) + quantity);
            }


        }
        for (String key : minerTask.keySet()) {

            System.out.println(key + " -> " + minerTask.get(key));

        }
    }
}
