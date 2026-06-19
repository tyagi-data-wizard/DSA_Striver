package MediumArrayProblem;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static Resource.Utility.inputArray;

public class LeaderInArray {

    public static void main(String[] args) {

//        int[] arr = inputArray();
        int[] arr = {4, 7, 1, 0};

        List<Integer> leaders = findLeaders(arr);
        Collections.reverse(leaders);

        System.out.print(leaders);
    }

    private static List<Integer> findLeaders(int[] arr) {

       List<Integer> leaders = new Stack<>();

        System.out.print("\nThe leaders are :");
        for (int i=arr.length-1;i>0;i--){

            for (int j=i;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
                    break;
                }
                if(j==arr.length-1){
                 //   System.out.print(arr[i]+" ");
                    leaders.add(arr[i]);
                }
            }

        }
        return leaders;
    }
}
