package BasicRecursion;

public class FibonacciSeries {


    // 0 +1 +1 +2 +3 +5


    //

    static int fibonacciSeries(int n){

        if(n==0 || n==1){
            return n;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);


    }


    public static void main(String[] args) {

        System.out.println(fibonacciSeries(5));

    }
}
