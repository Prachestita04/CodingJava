import java.util.Scanner;

public class $52StarPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern6(line);
    }

    private static void printStarPattern6(int l) {
        for (int i = 1; i <= l; i++) {
            for (int j = l; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
