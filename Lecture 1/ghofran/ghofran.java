package ghofran;
import java.util.Scanner;

public class ghofran {

    public static void main(String[] args) {
        double a, b, result;
        a = b = 0;
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter 1st number=> ");
            a = scanner.nextDouble();
            System.out.println("Enter 2nd nember=> ");
            b = scanner.nextDouble();
        } catch (Exception inputError) {
            System.out.println("Input is not available");
            System.exit(1);
        }

        System.out.println("the result of the calculations");
        result = a + b;
        System.out.println("a+b = " + result);
        result = a - b;
        System.out.println("a-b = " + result);
        result = a * b;
        System.out.println("a*b = " + result);

        if (b != 0) {
            result = a / b;
            System.out.println("a/b = " + result);
        } else {
            System.out.println("a/b = unknown");
        }
        scanner.close();
    }
}