import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] brackets = reader.readLine().toCharArray();

        if (brackets.length % 2 == 1) {
            System.out.println("NO");
            return;
        }
        boolean flag = true;
        for (char symbol : brackets) {

            if (symbol == '{' || symbol == '(' || symbol == '[') {
                stack.push(symbol);
            } else {

                char currentSymbol = stack.pop();

                if (symbol == '}') {
                    symbol = '{';
                }
                if (symbol == ']') {
                    symbol = '[';
                }
                if (symbol == ')') {
                    symbol = '(';
                }
                if (currentSymbol != symbol) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }


        }
        if (flag) {
            System.out.println("YES");
        }
    }
}
