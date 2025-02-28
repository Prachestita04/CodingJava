import java.util.Scanner;

public class $17FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number whose factorial you want to display");
        int num = sc.nextInt();
        // int result=1;
        //findFactorial(num);
        System.out.println(usingRecursion(num));
    }

    private static void findFactorial(int n) {
        if (n == 0 || n == 1) {
            System.out.println("The factorial is 1");
        } else if (n > 1) {
            int result = 1;
            for (int i = n; i >= 1; i--) {
                result = result * i;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid input. Give a positive integer");
        }

    }

    private static int usingRecursion(int n1) {
        if (n1 == 0 || n1 == 1) {
            return 1;
        }
        return n1 * usingRecursion(n1 - 1);

    }
}
