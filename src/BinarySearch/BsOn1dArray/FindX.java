package BinarySearch.BsOn1dArray;

import java.sql.SQLOutput;
import java.util.Arrays;

import static Resource.Utility.inputArray;

public class FindX {


    public static void main(String[] args) {
        int[] arr = inputArray();
        int x = 6;
//        Arrays.sort(arr);
        System.out.println("Element at : "+ findX(arr, x));
    }

    private static int findXrecursion(int[] arr,int low,int high){
            return 1;
    }

    private static int findX(int[] arr, int target) {
        int low=0,high=arr.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==target) return  mid+1;
            else if(arr[mid]< target) low = mid+1;
            else high = mid -1;

        }
        return -1;
    }
}
