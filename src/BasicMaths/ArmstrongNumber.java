package BasicMaths;

public class ArmstrongNumber {

    static int findLength(int n){
        int  len = (int) Math.floor(Math.log10(n)) + 1;
        return len;
    }

    static String checkArmstrong(int n){
        int len = findLength(n);
        int original = n;
        int sum =0;

        while(n!=0){
            sum += (int) Math.pow(n%10, len);
            n=n/10;

        }
        if(sum==original){
            return "Yes";
        }
        return "No";

    }


    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
    }
}
