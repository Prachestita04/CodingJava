import java.util.Scanner;

public class $43NumberPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line3 = sc.nextInt();
        printNumberPattern4(line3);
    }
    private static void printNumberPattern4(int l3){
        for (int i=1;i<=l3;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
