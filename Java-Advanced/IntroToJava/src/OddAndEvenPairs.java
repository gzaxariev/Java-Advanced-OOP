import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // String[] num = scanner.nextLine().split("\\s+");
       // int[] numbers = new int[num.length];
//
       // for (int i = 0; i <num.length ; i++) {
//
       //     numbers[i] = Integer.parseInt(num[i]);
       // }

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length % 2 == 1){
            System.out.println("invalid length");
        }
        else{

            for (int i = 0; i <numbers.length ; i+=2) {

                if (numbers[i] % 2 == 0 && numbers[i +1] % 2 == 0){
                    System.out.println(numbers[i] + ", " + numbers [i+1] + " " + "-> " + "both are even" );
                }
                else if(numbers[i] % 2 == 1 && numbers[i +1] % 2 ==1) {
                    System.out.println(numbers[i] + ", " + numbers[i +1] + " -> " + "both are odd");
                }
                else {
                    System.out.println(numbers[i] + ", " + numbers[i+1] + " -> " + "different");
                }
            }
        }
    }
}
