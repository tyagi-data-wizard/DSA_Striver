package BasicMaths;

public class GCD {

    static int findGcd(int a, int b){

        if(a==b){
            return a;
        }

        if(a==0){
            return b;
        }

        if(b==0){
            return a;
        }

        if(a>b) {
            findGcd(b, a);
        }

        for(int i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findGcd(20,4));
        System.out.println(findGcd(14,8));
    }
}
