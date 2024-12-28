import java.util.Scanner;

public class RecursionPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (testPrime(num, 2)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    private static boolean testPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }

        return testPrime(number, divisor + 1);

    }
}
