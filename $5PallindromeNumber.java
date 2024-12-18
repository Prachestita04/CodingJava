import java.util.Scanner;

public class $5PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        usingReverseNumber(num);

    }

    private static void usingReverseNumber(int x) {
        int newNum=x;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if(rev==newNum){
            System.out.println("The given number is a palindrome number.");
        }
        else {
            System.out.println("It is not a palindrome number. ");
        }
    }
}
