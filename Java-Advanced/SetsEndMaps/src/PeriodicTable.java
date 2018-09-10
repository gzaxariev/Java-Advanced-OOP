import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        while (numb-- > 0) {

            String[] chemicalElements = scanner.nextLine().split("\\s+");

            for (String element : chemicalElements) {

                if (!elements.contains(element)) {
                    elements.add(element);
                }
            }


        }
        for (String element : elements) {
            System.out.print(element + " ");

        }


    }
}
