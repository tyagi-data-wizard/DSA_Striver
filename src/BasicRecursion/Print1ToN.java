package BasicRecursion;

public class Print1ToN {


    public static void printNos(int N)
    {
        while(N>0){

            printNos(N-1);
            System.out.print(N+" ");
            return;
        }
    }
    public static void main(String[] args) {

        printNos(13);

    }
}
