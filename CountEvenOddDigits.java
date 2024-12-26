import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        countEvenOdd(num);
    }

    private static void countEvenOdd(int x) {
        int even = 0;
        int odd = 0;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The even numbers are: " + even);
        System.out.println("The odd numbers are:" + odd);
    }
}
