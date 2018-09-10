import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> nameAndEmails = new LinkedHashMap<>();

        while (true){
            String name = scanner.nextLine();
            if ("stop".equals(name)) {
                break;
            }
            String emails = scanner.nextLine();

            int index = emails.lastIndexOf(".");

            String searchingEmailExtension = emails.substring(index + 1);

            if(!searchingEmailExtension.equals("us") && !searchingEmailExtension.equals("com") &&
                    !searchingEmailExtension.equals("uk")){

                if (!nameAndEmails.containsKey(name)){
                    nameAndEmails.put(name, emails);
                }else{
                    nameAndEmails.put(name, nameAndEmails.get(name));

                }
            }

        }


        for (String key : nameAndEmails.keySet()) {

            System.out.println(key + " -> " + nameAndEmails.get(key));

        }
    }
}
