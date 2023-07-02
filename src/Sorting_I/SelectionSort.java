package Sorting_I;

import java.util.Scanner;


public class SelectionSort {

    public static void main(String[] args) {

        System.out.println("Please enter length of array : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements");
        for (int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("UnSorted Array : ");
        for (int i:arr) {
            System.out.print(i+ " ");
        }

       selectionSort(arr);

        System.out.println("\nSorted Array : ");
        for (int i:arr) {
            System.out.print(i+ " ");
        }

    }

    //find min; swap
    // find min; swap
    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){

            int min = i;
            //find min from i to n-2
            for (int j = i; j < arr.length; j++) {

                if(arr[j]<arr[min]){
                    min=j;
                }
            }
           //swap
            swapElement(i,min, arr);


        }

    }

    private static void swapElement(int i, int min, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;

    }
}
