package Resource;

import java.util.Scanner;

public class Utility {
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
}
