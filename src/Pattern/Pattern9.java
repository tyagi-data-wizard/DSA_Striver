package Pattern;

public class Pattern9 {

    static void printDiamond(int n) {
        //1-5;
        //4space 1* 4space; row=1
        //3space 2* 3space; row=2
        //2space 3* 2space; row=3
        //

        for(int row=0;row<n;row++){
            //space
            for(int col=0;col<n-1-row;col++){

                System.out.print(" ");
            }

            //star
            for(int col=0;col<row+1;col++){
                System.out.print("* ");

            }

            //last space
            for(int col=0;col<n-2-row;col++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int row=0;row<n;row++){
            //space
            for(int col=0;col<row;col++){
                System.out.print(" ");
            }

            //star
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }

            //last space
            for(int col=0;col<row-1;col++){
                System.out.print(" ");
            }

            System.out.println();
        }



    }

    public static void main(String[] args) {

        printDiamond(6);
    }
}
