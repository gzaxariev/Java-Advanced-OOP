import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Long> map = new TreeMap<>();

        long counter = 1;

        for (int i = 0; i <text.length() ; i++) {

            if (!map.containsKey(text.charAt(i))){
                map.put(text.charAt(i), counter);
            }else{
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        for (Character key : map.keySet()) {

            System.out.printf("%s: %d time/s\n", key, map.get(key));
        }
    }
}
