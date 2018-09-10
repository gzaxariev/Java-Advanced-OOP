import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {


        Consumer<String> print = System.out::println;
        Arrays.stream(new BufferedReader(new InputStreamReader(System.in))
                .readLine().trim().split("\\s+")).forEach(print);



    }
}