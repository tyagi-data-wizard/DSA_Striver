package EasyArrayProblems;

import java.util.Scanner;

public class MissingNumberInArray {


    public static int findMissingNumBrute(int[] arr, int len){

        for (int i =0;i<len;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }

    public static int[] inputArray(){
        System.out.println("Enter the number of elements");
        Scanner sc  = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements");
        for (int i = 0; i < len; i++) {
            arr[i] =sc.nextInt();
        }
        return  arr;
    }


    public static void main(String[] args) {
        int[] arr = inputArray();

        int missingNum = findMissingNumBrute(arr, arr.length);
        System.out.println("Missing number by bruteforce approach is :"+missingNum);
    }
}
