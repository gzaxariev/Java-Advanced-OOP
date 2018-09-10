import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] text = reader.readLine().split("[\\s+,.!?]+");

        Set<String> polidromes = new TreeSet<>();

        for (String s : text) {

            if (s.equals(new StringBuffer(s).reverse().toString())){
                polidromes.add(s);
            }
        }
        System.out.println(polidromes);
    }
}
