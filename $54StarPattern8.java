import java.util.Scanner;

public class $54StarPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern8(line);
    }

    private static void printStarPattern8(int l) {
        for (int i = l; i >= 1; i--) {
            for (int j = l; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
