import java.util.Scanner;

public class $49StarPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern3(line);
    }
    private static void printStarPattern3(int l){
         for (int i=1;i<=l;i++){
             for (int j=l;j>=i;j--){
                 System.out.print(" ");
             }
            for (int k=1;k<=i;k++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
