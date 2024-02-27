package MediumArrayProblem;

import java.util.Scanner;

public class MaxSubArrayKadane {

    static int maxSubArrayKadanesAlgo(int[] arr){
        int max= Integer.MIN_VALUE;
        int sum = 0;
        int start=0, ansStart=-1, ansEnd=-1;
        for(int i =0;i<arr.length;i++){

            if(sum==0)
                start=i;

            sum+=arr[i];

            if (max<sum){
                max=sum;

                ansStart=start;
                ansEnd=i;

            }

            if(sum <0){
                sum = 0;
            }

        }


        System.out.println("The max subarray : ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return max;
    }

    static int maxSubArrayBetter(int[] arr){
        int max= Integer.MIN_VALUE;

        //iterate over each element array
        for(int i=0;i<arr.length;i++){
            int sum  = 0;
            for (int j = i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max = sum;
                }

            }

        }
        return max;

    }


    static Scanner sc = new Scanner(System.in);


    public static int[] inputArray(){
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = inputArray();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sub Array Brute Force "+maxSubArrayBetter(arr));
        System.out.println("Max Sub Array Kadane's Force "+ maxSubArrayKadanesAlgo(arr));


    }
}
