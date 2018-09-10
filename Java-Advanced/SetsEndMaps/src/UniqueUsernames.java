import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet namesSet = new LinkedHashSet<>();

        int countNumbers = Integer.parseInt(scanner.nextLine());

        while (countNumbers-- > 0){

            String name = scanner.nextLine();

            namesSet.add(name);
        }

        for (Object n : namesSet) {
            System.out.println(n);
        }
    }
}
