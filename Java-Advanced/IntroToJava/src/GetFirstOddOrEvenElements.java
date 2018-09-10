import java.util.Arrays;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[] get = scanner.nextLine().split("\\s+");

        int number = Integer.parseInt(get[1]);

        int count = 0;


        for (int i = 0; i < input.length; i++) {

            if (number <= 0){
                break;
            }

            if (input[i] % 2 == 0 && get[2].equals("even")) {
                count++;
                if (count <= number) {

                    System.out.print(input[i] + " ");

                }

            } else if (input[i] % 2 == 1 && get[2].equals("odd")) {
                count++;
                if (count <= number) {
                    System.out.print(input[i] + " ");

                }

            }

        }
       // System.out.println();
    }
}
