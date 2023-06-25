package Pattern;

public class Pattern14 {

    static void printTriangle(int n) {


        for(int row=0;row<n;row++){
            char alpha = 'A';
            for(int col=0;col<=row;col++){
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
