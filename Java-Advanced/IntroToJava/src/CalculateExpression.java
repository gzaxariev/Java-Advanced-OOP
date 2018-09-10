import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double f1 =Math.pow(((a * a + b * b) / ( a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
        double f2 = Math.pow(Math.pow(a,2) + Math.pow(b, 2) - Math.pow(c,3), (a - b));

        double diff = Math.abs(((a + b + c) / 3) -((f1 + f2) / 2));

        System.out.printf("F1 result: %.2f; ", f1);
        System.out.printf("F2 result: %.2f; ", f2);
        System.out.printf("Diff: %.2f", diff);
    }
}
