import java.util.Scanner;

public class $53StarPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern7(line);
    }

    private static void printStarPattern7(int l) {
        for (int i = 1; i <= l; i++) {
            for (int j = l; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int m = 2; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
