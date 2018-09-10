import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] coordinates = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = coordinates[0];
        int m = coordinates[1];

        int[][] matrix =new int[n][m];

        String line = reader.readLine();

        while (!"Here We Go".equalsIgnoreCase(line)){

            int[] numbers = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();

            int x1 = numbers[0];
            int y1 = numbers[1];
            int x2 = numbers[2];
            int y2 = numbers[3];

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <=y2 ; j++) {
                    matrix[i][j]++;
                }

            }

            line = reader.readLine();
        }
        for (int[] ints : matrix) {
            for (int c : ints) {
                System.out.print(c + " ");
            }
            System.out.println();


        }

    }
}
