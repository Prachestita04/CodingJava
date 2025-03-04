import java.util.Scanner;

public class $50StarPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern4(line);
    }
    private static void printStarPattern4(int l){
        for (int i=1;i<=l;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=l;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
