package EasyArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementArray {

    private static int secondMaxUsingSort(int[] arr){
        //sort array
        Arrays.sort(arr);
        //return second max
        return arr[arr.length - 2];
    }

    private static int secondMaxUsingTraversal(int[] arr){
        //find max first
        int max = Integer.MIN_VALUE;

        //finding max
        for(int i: arr){
            if(i>max){
                max = i;
            }
        }

       // System.out.println("Max is :"+max);
        int secondMax = Integer.MIN_VALUE;
        //finding second max
        for(int i : arr){
            if(i>secondMax && i!= max){
                secondMax = i;
            }
        }

        return secondMax;

    }

    private static int[] inputArray(){
        System.out.println("Enter the length of array");
        int len;
        Scanner sc =  new Scanner(System.in);
        len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr =inputArray();

        System.out.println("The second max using sorted  is:"+secondMaxUsingSort(arr));

        System.out.println("The second max using traversal is:"+secondMaxUsingTraversal(arr));

    }
}
