package DSAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class $6MergeSort {
    int[] arr;
    int[] tempArr;
    int length;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] inputArr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
        $6MergeSort ms = new $6MergeSort();
        ms.doMergeSort(inputArr);
        System.out.println("Sorted array is: ");
        for (int i:inputArr){
            System.out.print(i+" ");
        }
    }
    public void doMergeSort(int[] inputArr){
          this.arr = inputArr;
          this.length = inputArr.length;
          this.tempArr = new int[length];
          divide(0,length-1);
    }
    public void divide(int lowerIndex,int higherIndex){
        if(lowerIndex < higherIndex){
            int middle  = lowerIndex+(higherIndex - lowerIndex)/2;

            divide(lowerIndex,middle);

            divide(middle+1,higherIndex);

            merge(lowerIndex,middle,higherIndex);
        }
    }
    public void merge(int lowerIndex, int middle,int higherIndex){
        for (int i=lowerIndex;i<=higherIndex;i++){
            tempArr[i] = arr[i];
        }
        int i=lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i<=middle && j<=higherIndex){
            if (tempArr[i]<=tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }
            else {
                arr[k]=tempArr[j];
                j++;
            }
            k++;
        }

        while (i<=middle){
            arr[k]=tempArr[i];
            i++;
            k++;
        }
    }
}
