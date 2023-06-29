package BasicRecursion;

public class IsStringPalindrome {

    static boolean checkPalindrome(String str, int start){

        if(start >= str.length()/2){
            return true;
        }
       if(str.charAt(start) != str.charAt(str.length()-start-1)){
           return false;
       }

       return checkPalindrome(str,start+1);
    }

    public static void main(String[] args) {

        String str = "ADDA";

        boolean isPalindrome = checkPalindrome(str,0);

        System.out.println(isPalindrome);

    }
}
