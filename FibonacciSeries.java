import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter place upto which you want your series:  ");
        int place = sc.nextInt();
        findFibonacciSeries(place);
    }

    private static void findFibonacciSeries(int p) {
        int num1 = 0, num2 = 1, num3 = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < p; i++) {
//            num3 = num1 + num2;
//            System.out.print(" " + num3);
//            num1 = num2;
//            num2 = num3;
            // System.out.println(" "+(num1+num2));
            System.out.print(" " + (num1 + num2) + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
    }
}
//0 1 1 2 3 5 8 13