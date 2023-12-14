package EasyArrayProblems;

import java.util.*;

public class UnionOfTwoSortedArrays {
//arr1[] = {1,2,3,4,5}
//arr2[] = {2,3,4,4,5}
//Output: {1,2,3,4,5}
    private static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2,int m,int n){

        ArrayList<Integer> arr = new ArrayList<>();
//        int[] arr = new int[len];
//        int count = 0;
        int i = 0;
        int j = 0;

        while(i<m && j<n ){
            if(arr1[i]<=arr2[j]){
                if(arr.size()==0 ||  arr.get(arr.size()-1)!= arr1[i])
                    arr.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[i])
                    arr.add(arr2[j]);
                j++;
            }
        }

        while (i < m) // IF any element left in arr1
        {
            if (arr.get(arr.size()-1) != arr1[i])
                arr.add(arr1[i]);
            i++;
        }
        while (j < n) // If any elements left in arr2
        {
            if (arr.get(arr.size()-1) != arr2[j])
                arr.add(arr2[j]);
            j++;
        }

        System.out.println("two pointer approach answer");
        System.out.print(arr);
        return arr;



    }

    private static void unionArrayByMap(int[] arr1,int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();


        for (int i = 0;i<arr1.length;i++){
            map.put(arr1[i],arr1[i]);
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],arr2[i]);
            set.add(arr2[i]);
        }

        System.out.print("map elements : ");
        System.out.print(Arrays.asList(map));
        System.out.println();

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }
    }

    private static int[] inputArray(){
        System.out.println("Enter the number of elements");
        Scanner sc  = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements");
        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = inputArray();

        int[] arr2 = inputArray();

        unionOfArrays(arr1,arr2, arr1.length, arr2.length);

        //unionArrayByMap(arr1,arr2);

    }
}
