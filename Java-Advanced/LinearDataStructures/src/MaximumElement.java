import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int commandsCount = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> sortedStack = new ArrayDeque<>();

        while (commandsCount-- > 0){
            int [] commands = Arrays.stream(reader.readLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (commands[0] == 1){

                stack.push(commands[1]);

                if (!sortedStack.isEmpty() && sortedStack.peek() >= commands[1]){
                    sortedStack.addLast(commands[1]);
                }else{
                    sortedStack.push(commands[1]);
                }
            }
            else if (commands[0] == 2){

               if (!stack.isEmpty()){
                   sortedStack.remove(stack.peek());
                   stack.pop();

               }
            }
            else if (commands[0] == 3){
                System.out.println(sortedStack.peek());
            }

        }
    }
}
