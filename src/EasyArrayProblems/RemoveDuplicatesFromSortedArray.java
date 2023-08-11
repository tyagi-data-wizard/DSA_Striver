package EasyArrayProblems;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    private  static int removeDuplicates(int[] arr){
        int i =0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }


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

        //System.out.println("The unique elements in this array are: "+removeDuplicatesUsingSet(arr));
        System.out.println("The unique elements in this array are: "+removeDuplicates(arr));
        printArray(arr);


    }
}
