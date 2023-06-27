package BasicRecursion;

public class PrintNameNTime {

    static void printNameNTime(int n, String name){
        while(n>0){
            printNameNTime(n-1,name);
            System.out.println(name);
            return;
        }

    }

    public static void main(String[] args) {
            printNameNTime(5, "psychbeast");
    }
}

