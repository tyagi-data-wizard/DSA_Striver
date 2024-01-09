package MediumArrayProblem;

import java.util.Scanner;

public class Sort012 {

    public static void swap(int i, int j, int[] arr){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void sortArrayDNFA(int[] arr){
        //DNFA
        //  000(low-1) (low)111(mid-1) (mid)1020102(high) (high+1)222(n-1)
        //take mid as your pointer

        // 0 1 2 2 1 0
        //low mid    high

        int low = 0,mid=0,high = arr.length-1;


        while (mid<=high){
                //if 0 then swap(low,mid) && low++ mid++
            if (arr[mid] == 0) {
//                int temp = arr[low];
//                arr[low] =  arr[mid];
//                arr[mid] = temp;
                swap(low,mid,arr);
                low++;
                mid++;
            }

            //if 1 then
            else if(arr[mid]==1){
                mid++;

            }

            //if 2 then swap(mid,high) & high--
            else if(arr[mid]==2){
                swap(mid,high,arr);
//                int temp = arr[high];
//                arr[high] =  arr[mid];
//                arr[mid] = temp;
                high--;
            }
        }

    }

    public static void sortArrayBetter(int[] arr){
        int zero=0,one=0,two=0;

        //count no of 0,1,2
        for(int i =  0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }

//        int[] newArr = new int[arr.length];
        for (int i = 0;i < arr.length; i++){
            if(zero>0){
                arr[i]=0;
                zero--;
                continue;
            }
            if(one>0){
                arr[i]=1;
                one--;
                continue;
            }
            if(two>0){
                arr[i]=2;
                two--;

            }

        }

    }

    static Scanner sc = new Scanner(System.in);
    public static int[] inputArray(){
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = inputArray();
        //sortArrayBetter(arr);
        sortArrayDNFA(arr);
        System.out.println("Sorted array is");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
