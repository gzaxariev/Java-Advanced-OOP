import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^\\+359([- ])\\d{1}\\1\\d{3}\\1\\d{4}$");

        String info ;

        while (!"end".equals(info = reader.readLine())){

            Matcher matcher = pattern.matcher(info);

            while (matcher.find()){

                System.out.println(info);
            }
        }
    }
}
