package BasicRecursion;

public class ReverseArray {

    static void reverseArray(int[] arr, int pos){
        if(pos==arr.length){
            return;
        }
        reverseArray(arr, pos+1);
        System.out.print(arr[pos]+" ");

    }


    static void reverseArraySec(int[] arr, int start, int end){
            if(start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                reverseArraySec(arr, start + 1, end - 1);
            }
    }

    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,3,4};
        System.out.println(arr.toString());

        reverseArray(arr, 0);

        System.out.println();

        reverseArraySec(arr, 0, arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
