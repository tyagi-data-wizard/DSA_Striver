package EasyArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementArray {

    private static int findLargestSumUsingSort(int[] arr){

        Arrays.sort(arr);
        printArray(arr);
        return arr[arr.length-1];
    }

    private static int findLargestElement(int[] arr){

        //O(n)
        int max = arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
    private static int[] inputArray(){
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static void printArray(int arr[]){
        for(int element : arr){
            System.out.println(element+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = inputArray();

        System.out.println("The largest element is : "+findLargestElement(arr));

        System.out.println("The largest element using sort is : " + findLargestSumUsingSort(arr));



    }
}

