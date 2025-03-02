import java.util.Scanner;

public class $38MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of "+num+" is: ");
        displayMultiplicationTable(num);
    }
    private static void displayMultiplicationTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+(n*i));
        }
    }
}
