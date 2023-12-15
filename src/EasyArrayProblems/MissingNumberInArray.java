package EasyArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {


    public static int findMissingNumBrute(int[] arr, int N){

        Arrays.sort(arr);
        for (int i =0;i<N-1;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return N;
    }

    public static int findMissingNumSum(int[] arr, int N){
        int sum = ( N * (N+1) )/2;

        for (int i = 0;i<arr.length;i++){
            sum = sum - arr[i];
        }
        return sum;
    }

    public static int findMissingNumHash(int[] arr, int N){
        int[] hashArray = new int[N+1];
        for (int i=0;i<arr.length;i++){
                hashArray[arr[i]]++;
        }

        for (int i = 1; i < N; i++) {
            if (hashArray[i]==0){
                return i;
            }
        }
        return N;
    }


    //XOR has quite unique prop
    // XOR(a,a) = 0 & XOR(a,0) = a
    public static int findMissingNumXOR(int[] arr, int N){
        int xor1=0, xor2=0;
        for(int i=0;i<N-1;i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2^ (i+1);
        }
        xor2 = xor2 ^ N;
        return xor1 ^ xor2;
    }

    public static int[] inputArray(){
        System.out.println("Enter N");
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N-1];
        System.out.println("Enter the elements");
        for (int i = 0; i < N-1; i++) {
            arr[i] =sc.nextInt();
        }
        return  arr;
    }


    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println("Missing number by bruteforce approach is : "+findMissingNumBrute(arr, arr.length+1));
        System.out.println("Missing number by using SUM formula is : "+ findMissingNumSum(arr, arr.length+1));
        System.out.println("Missing number by using Hashing is : "+ findMissingNumHash(arr, arr.length+1));
        System.out.println("Missing number by using XOR is : "+ findMissingNumXOR(arr, arr.length+1));

    }
}
