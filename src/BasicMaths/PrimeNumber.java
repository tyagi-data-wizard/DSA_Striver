package BasicMaths;

public class PrimeNumber {

    static boolean checkPrimeNaive(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean checkPrimeOptimal(int n){
        for(int i= 0;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if(checkPrimeNaive(11)){
            System.out.println("Prime");
        }else{
            System.out.println("Non-Prime");
        }

        if(checkPrimeNaive(23)){
            System.out.println("Prime");
        }else{
            System.out.println("Non-Prime");
        }
    }
}
