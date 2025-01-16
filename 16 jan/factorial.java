import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

    public static BigInteger Factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        BigInteger result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
