package Pattern;

public class Pattern5 {

    static void printTriangle(int n) {
        for(int row=0;row<n;row++){
            for(int col=n;col>row;col--){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
