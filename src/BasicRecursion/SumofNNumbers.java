package BasicRecursion;

public class SumofNNumbers {

    static int sumRecursionFunctional(int n){
        if(n==0){
            return 0;
        }
        return n + sumRecursionFunctional(n-1);
    }

    static void sumRecursionParamterized(int n, int sum){
        if(n<1){

            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        sumRecursionParamterized(n-1,sum+n);
    }

    public static void main(String[] args) {
        System.out.println(sumRecursionFunctional(5));
        sumRecursionParamterized(5,0);

    }
}
