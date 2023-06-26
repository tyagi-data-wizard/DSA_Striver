package Patterns;

public class Pattern16 {

    static void printTriangle(int n) {

        char alpha = 'A';
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print(alpha);
            }
            System.out.println();
            alpha++;
        }
    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
