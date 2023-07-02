package Sorting_I;

import java.util.Scanner;


public class SelectionSort {

    public static void main(String[] args) {

        int[] arr  = inputArray();

        System.out.println("UnSorted Array : ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted Array : ");
        printArray(arr);
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
