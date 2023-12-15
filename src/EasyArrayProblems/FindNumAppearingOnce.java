package EasyArrayProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNumAppearingOnce {

    /*
    brute force- 2 for loops of the array comparing each element of the array to the array itself
    hashing - nope; find max, init array[max+1], then use hashing
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
//            if(map.containsKey(arr[i])) {
//                map.put(arr[i], 2);
//            }else{
//                map.put(arr[i],1);
//            }

            //use this
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //Integer key = entry.getKey();
            //Integer value = entry.getValue();
            if(entry.getValue()==1){
                return entry.getKey();
            }

        }
        return -1;
    }


    //not working in cae : 1 1 2 2 3 - where the number coming once comes in last
    public static int findNumHashing(int[] arr){
        int max = arr[0];
        for (int i:arr) {
            if(max<i){
                max = i;
            }
        }

        int[] hashArr = new int[max+1];

       for(int i = 0;i<arr.length;i++){
           hashArr[arr[i]] ++;
       }

        for(int i =0;i<hashArr.length;i++){
            if(hashArr[i]==1){
                return arr[i];
            }
        }

        return -1;

    }


    public static int findNumXOR(int[] arr){
        //optimal approach
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        return xor;
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
        System.out.println("The number appearing only once via brute force is : "+findNumLinearSearch(arr));
        System.out.println("The number appearing only once via map is : "+findNumMap(arr));
        System.out.println("The number appearing only once via hashing is : "+findNumHashing(arr));
        System.out.println("The number appearing only once via XOR is : "+findNumXOR(arr));
    }
}
