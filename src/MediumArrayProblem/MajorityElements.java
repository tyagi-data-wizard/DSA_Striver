package MediumArrayProblem;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElements {


    public static int findMajorityElementMooreVotingAlog(int[] arr){
        //do + and -  for each instance of element el
        int el=arr[0];
        int count = 0;

        for (int i = 1; i<arr.length; i++){


            if(count==0){
                count++;
                el = arr[i];
            }else if(el == arr[i]){
                count++;
            }else{
                count--;
            }

        }
        int verifyCount = 0;
        for(int i =0;i<arr.length;i++){
            if(el==arr[i]){
                verifyCount++;
            }
        }
        if(verifyCount> (arr.length/2)){
            return el;
        }
        return -1;
    }


    public static int findMajorityElementBetter(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            if(map.containsKey(i)){
                int freq = map.get(i)+1;
                if(freq > (arr.length/2)){
                    return i;
                }
                map.put(i,freq);
            }else{
                map.put(i,1);
            }
        }
        return 0;
    }

    public static int findMajorityElementUnique(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        /*
        arr = 2 3 4 3 3 1 3
        map
        key     value
        2          1
         */
        int max = 0;
        int maxNum = 0;
        for (int num : arr){
            if(map.containsKey(num)){
                int freq = map.get(num);
                if(freq>max){
                    max = freq;
                    maxNum = num;
                }
                map.put(num,freq+1);
            }else{
                map.put(num,1);
            }
        }

        return maxNum;

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
        int[] arr = inputArray();

        System.out.println("The Majority Element is : "+ findMajorityElementUnique(arr));
        System.out.println("The Majority Element is : "+ findMajorityElementBetter(arr));
        System.out.println("The Majority Element is : "+ findMajorityElementMooreVotingAlog(arr));
    }
}
