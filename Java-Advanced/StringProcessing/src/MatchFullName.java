import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");

        while (!"end".equals(line = reader.readLine())){

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){

                System.out.println(line);
            }
        }
    }
}
