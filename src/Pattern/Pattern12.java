package Pattern;

public class Pattern12 {

    /*
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
     */
    static void printTriangle(int n) {

        for(int row=0;row<n;row++){

            int count = 1;

            //number
            for(int col=0;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }

            //space
            for(int col=0;col<4*(n-row)-4;col++){
                System.out.print(" ");
            }

            //number
            for(int col=0;col<=row;col++){
                count--;
                System.out.print(count+" ");

            }
            System.out.println();


        }

    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
