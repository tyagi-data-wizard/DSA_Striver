package EasyArrayProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class LongestSubArraySumkPositive {


    static Scanner sc  = new Scanner(System.in);

    public static int findSubArrayBrute(int[] arr, int K){
        //1, 11, 112, 1121,...
        //1 2 3 1 1 1 1 4 2 3
        // 1
        // 1 2, 123, 1231,

        int max  = 0;
        for(int i = 0;i<arr.length;i++){

            for(int j = i;j<arr.length;j++){
               int sum = 0;
                for(int k  =i;k<=j;k++){
                    sum=sum+arr[k];
                    //enhancing
                    if(sum>K){
                        break;
                    }
                }
                if(sum == K ){
                    max = max(max,j-i+1);
                }else if(sum > K){      //enhancing
                    break;
                }
            }
        }

        return max;

    }

    public static int findSubArrayBruteEnhanced(int[] arr, int K){
        int max = 0;
        for(int i = 0 ;i<arr.length;i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == K ){
                    max = max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static int findSubArrayBetter(int[] arr, int K){
        HashMap<Integer,Integer> map = new HashMap<>();

        int max=0;
        int sum = 0;
        for(int i = 0;i<arr.length ; i++){
            sum=+arr[i];

            if(sum == K){
                max =max(max, i+1);

            }

            int req = abs(K - sum);
            if(map.containsKey(req)){
                int len = i - map.get(req);
                max = max(max,len);
            }


            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }


    public static int findSubArrayOptimized(int[] arr, int K){
        //two pointer approach
        // 2 1 3 1 1 1 4 2 3
        //

        int sum = 0;
        int max = 0;

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum=+arr[i];

            if(sum == K){
                max= max(max,i+1-p2);
            }

            if(sum>K){
                int rem = max - arr[p2];
                p2++;
            }
        }


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


        System.out.println("The longest sub array wth sum "+K+" via Brute force is : "+ findSubArrayBrute(arr,K));
        System.out.println("The longest sub array wth sum "+K+" via  Enhanced Brute force is : "+ findSubArrayBruteEnhanced(arr,K));
        System.out.println("The longest sub array wth sum "+K+" via  better approach is : "+ findSubArrayBetter(arr,K));


    }
}
