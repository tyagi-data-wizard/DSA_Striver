package Pattern;

public class Pattern6 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
