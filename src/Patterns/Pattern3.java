package Patterns;

public class Pattern3 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){

            for(int col=0;col<=row;col++){
                System.out.print(col+1+" ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
