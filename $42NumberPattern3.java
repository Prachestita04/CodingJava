import java.util.Scanner;

public class $42NumberPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line2 = sc.nextInt();
        printNumberPattern3(line2);
    }
    private static void printNumberPattern3(int l2){
        for (int i=1;i<=l2;i++){
            for (int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
