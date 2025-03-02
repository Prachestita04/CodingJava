import java.util.Scanner;

public class $37CalculatorSwitch {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo Division");
        System.out.println("6. Exit Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st input: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd input: ");
        int num2 = sc.nextInt();
        calculate(num1,num2);
    }
    private static void calculate(int n1,int n2) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: ");
            String s = sc.next();
            switch (s) {
                case "1":
                    int sum = n1 + n2;
                    System.out.println("Addition is : " + sum);
                    break;
                case "2":
                    int sub = n1 - n2;
                    System.out.println("Subtraction is : " + sub);
                    break;
                case "3":
                    int mul = n1 * n2;
                    System.out.println("Multiplication is : " + mul);
                    break;
                case "4":
                    int div = n1/n2;
                    System.out.println("Division is: "+div);
                    break;
                case "5":
                    int moddiv = n1%n2;
                    System.out.println("Modulo Division is: "+moddiv);
                    break;
                case "6":
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
