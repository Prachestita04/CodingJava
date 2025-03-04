import java.util.Scanner;

public class $47StarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no which you want to see: ");
        int line = sc.nextInt();
//        printStarPattern1(line);
//        printPattern2(line);
        printPattern3(line);
    }
    private static void printStarPattern1(int l){
        for (int i=1;i<=l;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    private static void printPattern2(int l1){
        for (int i=1;i<=l1;i++){
            for (int j=1;j<=l1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    private static void printPattern3(int l2){
        for (int i=1;i<=l2;i++){
            for (int j=l2;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
