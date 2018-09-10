import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] commands = scanner.nextLine().split("\\s+");

        int elementsToPush = Integer.parseInt(commands[0]);
        int elementsToRemove = Integer.parseInt(commands[1]);
        int surchingElenets = Integer.parseInt(commands[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int [] elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <elementsToPush ; i++) {

            queue.add(elements[i]);
        }
        for (int i = 0; i <elementsToRemove ; i++) {

            queue.remove();
        }
        if (queue.contains(surchingElenets)){
            System.out.println("true");
        }else if(queue.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(Collections.min(queue));
        }

    }
}
