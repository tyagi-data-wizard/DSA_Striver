package BasicRecursion;

public class ReverseArray {

    static void reverseArray(int[] arr, int pos){
        if(pos==arr.length){
            return;
        }
        reverseArray(arr, pos+1);
        System.out.print(arr[pos]+" ");

    }

    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,3,4};
        System.out.println(arr.toString());

        reverseArray(arr, 0);
    }
}
