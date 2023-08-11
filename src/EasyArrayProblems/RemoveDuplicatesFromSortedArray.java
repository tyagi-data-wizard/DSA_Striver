package EasyArrayProblems;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {


    private static int removeDuplicatesUsingSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i:arr){
            set.add(i);
        }

        int len = set.size();
        int j=0;

        for(int i:set){
           arr[j++] = i;
        }

        return len;

    }

    private static void printArray(int[] arr){
        System.out.println("The elements of the array are:");
        for (int i:arr){
            System.out.print(i +" ");
        }
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

        System.out.println("The unique elements in this array are: "+removeDuplicatesUsingSet(arr));
        printArray(arr);


    }
}
