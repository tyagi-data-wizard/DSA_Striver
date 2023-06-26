package Patterns;

public class Pattern11 {


    /*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
     */

    //static int var ;
    static void printTriangle(int n) {
        int var =1;
        for(int row=0;row<n;row++){
            if(row%2==0){
                //start with 1
                var=1;

            }else if(row%2!=0){
                //start with 0
                var=0;
            }
            for(int col=0;col<=row;col++){

                System.out.print(var+" ");
                var = flip(var);
            }
            System.out.println();
        }
    }

    static int flip(int n){
        if(n==0){
            n=1;
            return n;
        }
        n = 0;
        return n;
    }
    public static void main(String[] args) {

        printTriangle(6);
    }
}
