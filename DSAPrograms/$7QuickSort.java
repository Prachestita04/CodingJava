//choose middle pivot element left side smaller than pivot and right side larger than pivot
package DSAPrograms;

import java.util.Scanner;

public class $7QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        $7QuickSort qs = new $7QuickSort();
        qs.doQuickSort(arr,0, arr.length-1);
        System.out.println("Sorted array is: ");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public int partition(int[] a,int low,int high){
        int pivot = a[(low+high)/2];
        while (low <=high){
            while (a[low]<pivot){
                low++;
            }
            while (a[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }
    public void doQuickSort(int[] a1,int low,int high){
        int pv = partition(a1,low,high);
        if (low<pv-1){
            doQuickSort(a1,low,pv-1);
        }
        if (pv<high){
            doQuickSort(a1,pv,high);
        }
    }
}
