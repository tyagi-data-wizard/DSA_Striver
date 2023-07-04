package Sorting_I;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println("UnSorted Array : ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array : ");
        printArray(arr);
    }

    //insert element in its correct place
    private static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
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
