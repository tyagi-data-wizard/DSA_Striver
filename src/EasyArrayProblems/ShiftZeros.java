package EasyArrayProblems;

import java.util.HashMap;
import java.util.Scanner;

public class ShiftZeros {

    //Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    //Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

    private static void moveZeroToEndOptimal(int[] arr){
        int j = -1;             //index for zero
        //find the first zero
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }

        //start iterating and swapping
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
        }


    }

    private static int[] moveZeroToEnd(int[] arr){
        int zeroCounter=0;
        int counter=0;
        int[] temp = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCounter++;
            }else{
               temp[counter] = arr[i];
               counter++;
            }
        }

        for(int i =counter;i< temp.length;i++){
            temp[i] = 0;
        }

        //changing the input array
        for(int i=0;i<counter;i++){
            arr[i] = temp[i];
        }

        //now setting rest of the elements as zero
        for(int i=counter;i<arr.length;i++){
            arr[i]=0;
        }
        return temp;
    }

    private static int[] inputArray(){
        System.out.println("Enter the number of in array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[len];
        for (int i =0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr){
        System.out.println("Output Array : ");
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = inputArray();

        //int[] finalArr =  moveZeroToEnd(arr);

        //printArray(finalArr);

        //System.out.println("\ninput array changed: ");printArray(arr);

        moveZeroToEndOptimal(arr);
        printArray(arr);


    }
}
