package BasicHashing;

import java.util.HashMap;

public class FrequencyOfElementInArray {

    static void frequencyCount(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){

            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }

//        for(int i : arr ){
//
//            System.out.println("key "+ i +" is "+ map.get(i) +" times.");
//        }
        for (Integer name: map.keySet())
        {
            System.out.println(name + " : " +map.get(name));
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,4,4,6,6};

        frequencyCountNaive(arr);

    }
}
