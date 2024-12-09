import java.util.Scanner;

public class $2SwapProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        //usingThirdVariable(num1, num2);
        //usingAddSub(num1, num2);
        //usingMultiDiv(num1, num2);
        //usingXor(num1, num2);
        usingSingleStatement(num1, num2);

    }

    private static void usingThirdVariable(int x, int y) {
        int temp = x;
        // System.out.println(x);
        x = y;
        //System.out.println(y);
        y = temp;
        //System.out.println(temp);
        System.out.println("After swapping the two numbers are: " + x + " and " + y);
    }

    private static void usingAddSub(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After this the numbers are : " + a + " and " + b);
    }

    private static void usingMultiDiv(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping the numbers are: " + a + " and " + b);
    }

    private static void usingXor(int c, int d) {
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("Swap numbers are: " + c + " and " + d);
    }

    private static void usingSingleStatement(int m, int n) {
        n = m + n - (m = n);
        System.out.println("After swap numbers are : " + m + " and " + n);
    }
}
