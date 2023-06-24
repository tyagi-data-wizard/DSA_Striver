package Pattern;

public class Pattern3 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){
            int count = 1;
            for(int col=0;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
