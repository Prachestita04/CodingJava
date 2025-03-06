import java.util.Scanner;

public class $55StarPattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
//        printStarPattern9(line);
        printPattern9(line);
    }

    private static void printStarPattern9(int l) {
        for (int i = 1; i <= l; i++) {
            for (int j = l; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i >= 2 && k > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void printPattern9(int l1) {
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i >= 2 && k > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}