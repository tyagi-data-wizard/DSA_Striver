package EasyArrayProblems;

import java.util.Scanner;

import static java.lang.Math.max;

public class LongestSubArraySumkPositive {


    static Scanner sc  = new Scanner(System.in);
    public static int findSubArrayBrute(int[] arr, int K){
        //1, 11, 112, 1121,...

        int max  = 0;
        for(int i = 0;i<arr.length;i++){

            for(int j = i;j<arr.length;j++){
               int sum = 0;
                for(int k  =i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum == K){
                    max = max(max,j-i+1);
                }
            }
        }

        return max;

    }

    public static int[] inputArray(){
        System.out.println("Enter N");

        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements");
        for (int i = 0; i < N; i++) {
            arr[i] =sc.nextInt();
        }
        return  arr;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println("Enter the sum");
        int K = sc.nextInt();


        System.out.println("The longest sub array wth sum "+K+" is : "+ findSubArrayBrute(arr,K));

    }
}
