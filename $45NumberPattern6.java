import java.util.Scanner;

public class $45NumberPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line up to which you want to see the pattern:");
        int line5 = sc.nextInt();
        printNumberPattern6(line5);
    }
    private static void printNumberPattern6(int l5){
        for (int i=1;i<=l5;i++){
            int n=i;
            for (int j=1;j<=i;j++){
                System.out.print(n+" ");
                n = n+l5-j;
            }
            System.out.println();
        }
    }
}
