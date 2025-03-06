import java.util.Scanner;

public class $51StarPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern5(line);
    }

    private static void printStarPattern5(int l) {
        for (int i = 1; i <= l; i++) {
            for (int k = l - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < l; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = l - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
