package BasicMaths;

public class AllDivisors {

    static long printSumOfDivisor(int n){
    long sum = 0;
        for(int i=1;i<=n;i++){
            int individualSum = printAllDivisorOptimal(i);
            sum += individualSum;

        }
        return sum;

    }

    static int printAllDivisorNaive(int n){

        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println();
        return sum;

    }

    static int printAllDivisorOptimal(int n){
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                sum+=i;
                if(i!=n/i){
                    System.out.print(n/i+" ");
                    sum+=n/i;
                }
            }
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        printAllDivisorNaive(36);
        printAllDivisorOptimal(36);

        System.out.println("sum : "+printSumOfDivisor(4));



    }
}
