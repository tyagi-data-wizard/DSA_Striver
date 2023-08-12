package EasyArrayProblems;

import java.util.Scanner;

public class LeftRotateArrayByOne {

    private static void leftRotate(int[] arr){

        int first = arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;

    }
    private static int[] inputArray(){
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of array:");
        for (int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = inputArray();

        leftRotate(arr);
        printArray(arr);
    }
}
