package Patterns;

public class Pattern8 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){
            //0 fspace 9 star   0 bspace
            //1 fspace 7star    1 bspace

            for(int col=0;col<row;col++){
                System.out.print(" ");
            }

            for(int col=0;col<2*(n-row)-1;col++){
                System.out.print("*");
            }



            for(int col=0;col<row;col++){
                System.out.print(" ");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
