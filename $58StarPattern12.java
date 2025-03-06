import java.util.Scanner;

public class $58StarPattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern12(line);
    }

    private static void printStarPattern12(int l) {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if (i >= 2 && i < l) {
                    if (j > 1 && j < l) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
