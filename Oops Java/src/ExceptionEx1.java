import java.util.Scanner;

public class ExceptionEx1 {
    public String divideTwoNumbers(int num1, int num2) {

        String result = "";

        try {
            int div = num1 / num2;
            result = "The answer is " + div + ".";
        } catch (ArithmeticException ignore) {
            result = "Division by zero is not possible.";
        } finally {
            result += " " + "Thanks for using the application.";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        ExceptionEx1 division = new ExceptionEx1();
        System.out.println(division.divideTwoNumbers(n1, n2));
    }
}

