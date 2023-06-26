package BasicMaths;

public class CheckPalindrome {


    static int reverseNumber(int n){
        int rev=0;
        while (n!=0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }

    static boolean checkPalindrome(int n){

        int rev = reverseNumber(n);
        if(rev==n){
            return true;
       }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(34343));
        System.out.println(checkPalindrome(34355));
    }
}
