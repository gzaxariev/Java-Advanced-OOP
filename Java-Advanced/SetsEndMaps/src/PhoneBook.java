import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> persons = new HashMap<>();


        while (true) {

            String command = scanner.nextLine();

            if ("search".equals(command)) {
                break;
            }

            String[] infoPersons = command.split("-");

            if (!persons.containsKey(infoPersons[0])) {
                persons.put(infoPersons[0], infoPersons[1]);
            }
        }
        String info = scanner.nextLine();

        while (!"stop".equals(info)) {

            if (persons.containsKey(info)) {
                System.out.println(info + " -> " + persons.get(info));
            } else {
                System.out.printf("Contact %s does not exist.%n", info);
            }
            info = scanner.nextLine();
        }


    }
}
