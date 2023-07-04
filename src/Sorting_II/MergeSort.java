package Sorting_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr  = inputArray();

        System.out.println("UnSorted Array : ");
        printArray(arr);

        mergeSort(arr, 0, arr.length-1);

        System.out.println("\nSorted Array : ");
        printArray(arr);
    }

    private static void mergeSort(int[] arr, int low, int high){

        //base condition
        if(low>=high) return;

        int mid = (low+high)/2;

        //recursion calls (divide)
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        //merge
        merge(arr, low, mid, high);



    }

    //3 2 4 1 3
    // 2 3 4
    private static void merge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid+1;
        List<Integer> res = new ArrayList<>();

        //if remaining on both side
       while(left<=mid && right<=high){
          if(arr[left]<=arr[right]){
              res.add(arr[left]);
              left++;
          }else{
              res.add(arr[right]);
              right++;
          }
       }

       //if remaining on left
       while(left<=mid){
           res.add(arr[left]);
           left++;
       }
       //if remaining on right
       while(right<=high){
           res.add(arr[right]);
           right++;
       }

       //now put elements from res to arr
        for (int i = low; i <= high; i++) {
            arr[i] = res.get(i-low);

        }
    }

    private static void printArray(int[] arr){
        for (int i:arr) {
            System.out.print(i+ " ");
        }
    }
    private static int[] inputArray() {
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements");
        for (int i = 0; i <len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}
