package MediumArrayProblem;

import java.util.ArrayList;

import static Resource.Utility.inputArray;



public class RearrangeArrayBySign {

//    {1,2,3,-4,-5,-3}
    static int[] rearrangeOptimal(int[] arr){
        int[] newArray = new int[arr.length];
        int posIndex=0,negIndex=1;

        for(int i =0;i<newArray.length;i++){
            if(arr[i]>=0){
                newArray[posIndex] = arr[i];
                posIndex+=2;
            }else{
                newArray[negIndex] = arr[i];
                negIndex+=2;
            }
        }

        return newArray;

    }
    static int[] rearrangeBrute(int[] arr){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] newArray = new int[arr.length];

        //separate negative and positive integers
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }

        int pos=0,neg=0;

        for(int i=0;i<newArray.length;i++){
            if(i%2==0 && positive.size()>pos){
                newArray[i] = positive.get(pos);
                pos++;
            }else if(negative.size()>neg){
                newArray[i]=negative.get(neg);
                neg++;
            }

        }

        return newArray;
    }

    public static void main(String[] args) {
        //int[] arr = inputArray();
        int[]arr = {1,2,3,-4,-5,-3,3,4};
        int[] newArray = rearrangeBrute(arr);
        System.out.println();
        System.out.print("Rearranged Array : ");
        for (int i:newArray
             ) {
            System.out.print(i+" ");

        }

        int[] newArrayOp = rearrangeBrute(arr);
        System.out.println();
        System.out.print("Rearranged Array by optimized approach: ");
        for (int i:newArrayOp
        ) {
            System.out.print(i+" ");

        }
    }
}
