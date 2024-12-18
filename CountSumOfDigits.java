import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        sumOfDigitsCount(num);
    }

    private static void sumOfDigitsCount(int x) {
        int result = 0;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            result = result + rem;
        }
        System.out.println("The of sum of digits of this number are:" + result);
    }
}
