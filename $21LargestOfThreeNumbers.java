import java.util.Scanner;

public class $21LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();
        //findLargest(num1, num2, num3);
        usingTernaryOperator(num1,num2,num3);
    }

    private static void findLargest(int x, int y, int z) {
        if (x > y && x > z && y!=z) {
            System.out.println("1st number is largest");
        } else if (y > x && y > z && x!=z) {
            System.out.println("2nd number is largest");
        } else if (z > x && z > y && x!=y) {
            System.out.println("3rd number is largest");
        } else {
            if (x == z && x > y) {
                System.out.println("1st 3rd equal large");
            } else if (x == y && x > z) {
                System.out.println("1st 2nd equal large");
            } else if (y == z && y > x) {
                System.out.println("2nd 3rd equal large");
            } else {
                if (x == z && x < y) {
                    System.out.println("1st 3rd equal 2nd large");
                } else if (x == y && x < z) {
                    System.out.println("1st 2nd equal 3rd large");
                } else if (y == z && y < x) {
                    System.out.println("2nd 3rd equal 1st large");
                } else {
                    System.out.println("All 3 numbers are equal");
                }
            }
        }
    }

    private static void usingTernaryOperator(int a,int b, int c){
//        int largest1 = a>b?a:b;
//        int largest2 = c>largest1?c:largest1;
        int largest = c>(a>b?a:b)?c:a>b?a:b;
        System.out.println(largest +"is largest");
    }
}
