package BasicRecursion;

public class FibonacciSeries {


    // f(5) = f(3) + f(4)
    // f(4) = f(3) + f(2)
    // f(3) = f(1) + f(0)
    // f(2) = f(0) + f(1) =
    //f(1) = 1
    //f(0) = 0


    //

    static int fibonacciSeries(int n){

        if(n==0 || n==1){
            System.out.print(n+" ");
            return n;
        }

        return fibonacciSeries(n-2) + fibonacciSeries(n-1);

    }


    public static void main(String[] args) {

    fibonacciSeries(5);

    }
}
