package EasyArrayProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {

    private static void LinearSearch(int element, int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element found at position: "+ (i+1));
                return;
            }
        }
        System.out.println("Element not present in array");
    }
    private static int[] inputArray(){
        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements:");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = inputArray();

        System.out.println("Which element you want to find");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        LinearSearch(element, arr);



    }
}
