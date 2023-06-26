package Patterns;

public class Pattern13 {

    static void printTriangle(int n) {

        int count=1;

        for(int row=0;row<n;row++){
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
