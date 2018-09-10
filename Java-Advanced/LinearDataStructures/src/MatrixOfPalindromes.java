import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] params = scanner.nextLine().split("\\s+");
        int rols =Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);

        String [] [] matrix = new String [rols][cols];

        for (int i = 0; i <rols ; i++) {

            for (int j = 0; j <cols; j++) {

                matrix[i][j] = "" + (char) ('a' + i) + (char) ('a' + i + j) + (char) ('a' + i);

            }

        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
}
