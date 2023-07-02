package BasicHashing;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class HighLowFrequency {

    static void calcFreqHigh(int[] arr){
     HashMap<Integer,Integer> freq = new HashMap<>();
     for(int i:arr){
         if(freq.containsKey(i)){
             freq.put(i, freq.get(i)+1);
         }else{
             freq.put(i,1);
         }
     }

     //find high and low freq

     int maxFreq = 0;
     int minFreq = arr.length;
     int max=0;
     int min=0;


     for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
         int element = entry.getKey();
         int count = entry.getValue();

         if(count>maxFreq){
             max = element;
             maxFreq = count;
         }
         if(count<minFreq){
             min = element;
             minFreq = count;

         }
     }

        System.out.println("The highest frequency element is: " + max+" : "+maxFreq);
        System.out.println("The lowest frequency element is: " + min+" : "+minFreq);
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,4,4,6,6,4,6};
        calcFreqHigh(arr);



    }
}
