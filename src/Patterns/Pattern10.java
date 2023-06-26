package Patterns;

public class Pattern10 {

    static void printTriangle(int n) {
        //first n
        for(int row=0;row<n;row++){
            //stars
            for(int col=0;col<row+1;col++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //last n-1
        for(int row=0;row<n-1;row++){

            for(int col=0;col<n-1-row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
