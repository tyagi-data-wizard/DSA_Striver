package Patterns;

public class Pattern7 {

    static void printTriangle(int n) {

        for (int row = 0; row < n; row++) {
            //spaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            //star
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");

            }

            //remaining space
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        printTriangle(6);
    }
}
