import java.util.Scanner;

public class $57StarPattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
        printStarPattern11(line);

    }
    private static void printStarPattern11(int l){
        for (int i=l;i>=1;i--){
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
        for (int i=2;i<=l;i++){
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

}
