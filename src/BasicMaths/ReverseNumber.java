package BasicMaths;

public class ReverseNumber {

    static int reverseNumber(int n){
        int rev=0;
        while(n!=0){

            rev = rev*10+n%10;
            n=n/10;

        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(34637));
    }
}
