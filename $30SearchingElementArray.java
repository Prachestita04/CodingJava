import java.util.Scanner;

public class $30SearchingElementArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        linearSearch(arr);
    }
    private static void linearSearch(int[] a){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element you want to search: ");
        int key = sc.nextInt();
        for (int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println("Given element is found in position: "+i);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("The given element is not found in array.");
        }
    }
}
