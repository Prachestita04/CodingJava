import java.util.Scanner;

public class $48StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern2(line);
    }
    private static void printStarPattern2(int l){
        for (int i=1;i<=l;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=l-1;i++){
            for (int j=l-1;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
