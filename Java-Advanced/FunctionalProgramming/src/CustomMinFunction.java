import jdk.nashorn.api.tree.IfTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> smallestnumb = numArr ->{
            int min = Integer.MAX_VALUE;
            for (int num : numArr) {
                if (num < min){
                    min = num;
                }
                
            }
            return min;
        };
        System.out.println(smallestnumb.apply(numbers));
    }
}
