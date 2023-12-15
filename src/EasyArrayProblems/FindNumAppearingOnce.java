package EasyArrayProblems;

import java.util.HashMap;
import java.util.Scanner;

public class FindNumAppearingOnce {

    /*
    brute force- 2 for loops of the array comparing each element of the array to the array itself
    hashing - nope
    hash map - would work, add the element with default value as 1, then iterate the map at the end
     */

    public static int findNumLinearSearch(int[] arr){
        int flag =0;
        for(int i=0;i<arr.length;i++){

            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    flag++;
                    if(flag ==2){
                        break;
                    }
                }
            }
            if(flag==1){
                return arr[i];
            }
            flag=0;
        }

        return -1;
    }


    public static int findNumMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i =0 ;i<arr.length; i++){
//            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

        }

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

        System.out.println("Array contains all numbers twice except one");
        int[] arr = inputArray();
        System.out.println("The number appearing only once is : "+findNumLinearSearch(arr));

    }
}
