package EasyArrayProblems;

import java.util.Scanner;

public class SortedArrayCheck {

    private static boolean isArraySorted(int[] arr){
        int prev = arr[0];
        for(int i : arr){
            if(prev <= i){
                prev= i ;
            }else{
                return false;
            }
        }
        return true;
    }


    private static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = inputArray();

        System.out.println("is the given array sorted ? : "+ isArraySorted(arr));

    }
}
