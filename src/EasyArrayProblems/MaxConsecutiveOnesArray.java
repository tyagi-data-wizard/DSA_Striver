package EasyArrayProblems;

import java.util.Scanner;

import static java.lang.Math.max;

public class MaxConsecutiveOnesArray {

    public static int countOnes(int[] arr){
        //we have a count var
        // if 1 count++, else max=count then count = 0
        int count = 0;
        int max = 0;

        for (int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                if(max<count){
                    max=count;
                }
                count =0;
            }
           // max = max(count,max);
        }
        return max;
    }

    public static int[] inputArray(){
        System.out.println("Enter N");
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements");
        for (int i = 0; i < N; i++) {
            arr[i] =sc.nextInt();
        }
        return  arr;
    }

    public static void main(String[] args) {

        System.out.println("Array contains only 1's and 0's");
        int[] arr =inputArray();
        System.out.println("Max consecutive ones are : "+ countOnes(arr));

    }
}
