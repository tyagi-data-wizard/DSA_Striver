package Sorting_I;

import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr  = inputArray();

        System.out.println("UnSorted Array : ");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array : ");
        printArray(arr);
    }

    private static void bubbleSort(int[] arr){

        //iterate through whole array
        for (int i = 0; i < arr.length; i++){
            int max = i;

            //find max
            for (int j = 0; j < arr.length - i-1; j++) {

                //swap max
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
