package BasicRecursion;

public class PrintNTo1 {


    static void printNos(int N)
    {
        if(N==0) {
            return;
        }
            System.out.print(N+" ");
            printNos(N-1);


    }
    public static void main(String[] args) {

        printNos(13);

    }
}
