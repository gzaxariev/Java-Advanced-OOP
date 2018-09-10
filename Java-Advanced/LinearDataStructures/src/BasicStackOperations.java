import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] numbers = scanner.nextLine().split("\\s+");

        int elementsToPush = Integer.parseInt(numbers[0]);
        int elementsToPop = Integer.parseInt(numbers[1]);
        int surchedElements =Integer.parseInt(numbers[2]);

        int[] elements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <elementsToPush ; i++) {

            stack.push(elements[i]);

        }
        for (int i = 0; i <elementsToPop ; i++) {

            if (stack.isEmpty()){
                break;
            }
            stack.pop();

        }
        if (stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(surchedElements)){
            System.out.println(true);
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
