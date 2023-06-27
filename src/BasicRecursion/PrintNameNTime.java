package BasicRecursion;

public class PrintNameNTime {

    static void printNameNTime(int n, String name){
        if(n==0){
            return;
        }
        printNameNTime(n-1,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
            printNameNTime(5, "psychbeast");
    }
}

