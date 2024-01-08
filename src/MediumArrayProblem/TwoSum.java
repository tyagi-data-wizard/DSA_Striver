package MediumArrayProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    static Scanner sc = new Scanner(System.in);


    public static String twoSumVar1Brute(int[] arr, int target){

        for(int i = 0;i<arr.length;i++){
            int sum = target - arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(sum == arr[j]){
                    return "Yes";
                }
            }

        }

        return "No";
    }

    public static String twoSumVar1Hashing(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int moreNeeded = target - arr[i];
            if(map.containsKey(moreNeeded)){
                return "Yes";
            }
            map.put(arr[i],i);

        }
        return "No";
    }

    public static String twoSumVar1TwoPointer(int[] arr, int target){
        Arrays.sort(arr);
        int left=0, right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else if(sum==target){
                return "Yes";
            }


        }
         return "No";

    }
    public static int[] inputArray(){

        System.out.println("Enter the number of elements in the array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i <len; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        System.out.println("Variant1 solution : "+twoSumVar1Brute(arr, target));
        System.out.println("Variant1 solution : "+twoSumVar1Hashing(arr, target));
        System.out.println("Variant1 solution : "+twoSumVar1TwoPointer(arr, target));
    }
}
