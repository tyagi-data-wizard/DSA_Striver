package Patterns;

public class Pattern15 {

    static void printTriangle(int n) {


        for(int row=0;row<n;row++){
            char alpha = 'A';
            for(int col=0;col<n-row;col++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
