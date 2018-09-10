import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");

        int N = Integer.parseInt(input[0]);

        String symbol = input[1];

        int [][] matrix = new int[N][N];

        int counter = 1;
        
        if (symbol.equals("A")){

            for (int col = 0; col <matrix.length ; col++) {
                for (int row = 0; row <matrix[col].length ; row++) {

                    matrix[row][col]= counter++;
                }
            }
            printMatrix(matrix);
        }else if (symbol.equals("B")){

            for (int col = 0; col <matrix.length ; col++) {
                if (col % 2 == 0){
                    for (int row = 0; row <matrix[col].length ; row++) {
                        matrix[row][col] =counter++;
                    }
                }else{
                    for (int row = matrix[col].length - 1; row >= 0; row--) {
                        matrix[row][col] = counter++;
                    }
                
                }
            }
            printMatrix(matrix);
            
        }

    }

    private static void printMatrix(int[][] matrix) {

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
            
        }
    }
}
