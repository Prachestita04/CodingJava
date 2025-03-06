import java.util.Scanner;

public class $56StarPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
//        printStarPattern10(line);
        printPattern10(line);
    }
    private static void printStarPattern10(int l){
        for (int i=1;i<=l;i++){
            for (int j=l;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    private static void printPattern10(int l1){
        for (int i=l1;i>=1;i--){
            for (int j=l1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
