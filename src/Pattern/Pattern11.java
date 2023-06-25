package Pattern;

public class Pattern11 {


    /*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
     */

    static int var ;
    static void printTriangle(int n) {

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
                flip(var);
            }
            System.out.println();
        }
    }

    static void flip(int n){
        if(n==0){
            var=1;
            return;
        }
        var = 0;
        return;
    }
    public static void main(String[] args) {

        printTriangle(6);
    }
}
