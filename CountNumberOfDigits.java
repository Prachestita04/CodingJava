import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        countDigits(num);
    }

    private static void countDigits(int x) {
        int count = 0;

        while (x > 0) {
            x = x / 10;
            count = count + 1;
        }

        System.out.println("The number of digits are: " + count);
    }
}
