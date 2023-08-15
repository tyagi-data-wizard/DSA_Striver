package EasyArrayProblems;

import java.util.Scanner;

public class RotateArrayByK {

   // 1 2 3 4 5
    // k =2 -> 4 5 1 2 3
    //i = 2; arr[4] = arr[2]
    //i=1; arr[3] = arr[1]
    //i=0; arr[2] = arr[0]

    private static void rightRotateArray(int k, int[] arr){
        int len = arr.length;
        k=k%len;
        int[] temp = new int[k];

        //storing elements from len-k to len in temp array
        for(int i=len-k; i<len;i++){
            temp[i-len+k] = arr[i];
        }

        //shifting elements from 0 to len-k-1, k places ahead
        for (int i = len - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        //putting k elements from the end to front; rotating the right side elements
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

    }

    private static int[] inputArray(){
        System.out.println("Enter the number of elements in array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements:");
        for(int i = 0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr){
        System.out.print("The array is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = inputArray();

        rightRotateArray(2,arr);
        printArray(arr);

    }
}
