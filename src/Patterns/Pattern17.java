package Patterns;

public class Pattern17 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){

            char ch='A';

            //space
            for(int col=0;col<=n-row-2;col++){
                System.out.print(" ");
            }

            //char
            for(int col=0;col<2*row+1;col++){
                System.out.print(ch);
                if(col<row){
                    ch++;
                }else{
                    ch--;
                }


            }

            //space
            for(int col=0;col<n-row-2;col++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
