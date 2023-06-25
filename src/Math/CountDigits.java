package Math;

public class CountDigits {


    //problem link : https://practice.geeksforgeeks.org/problems/count-digits5716/1

    static int evenlyDivides3(int N){
      int len = (int) Math.floor(Math.log10(N))+1;
      return len;
    }

    static int evenlyDivides2(int N){
        String s = String.valueOf(N);
        return s.length();
    }
    static int evenlyDivides1(int N){
        int og = N;
        int count = 0;

        while(N!=0){
            int div=N%10;
            //System.out.println("div : "+div);
            if(div!=0 && og%div==0){
                count++;
            }
            N=N/10;
        }

        return count;

    }

    public static void main(String[] args) {

        int count = evenlyDivides1(45);
        System.out.println(count);

        System.out.println("length = "+evenlyDivides2(46546));

        System.out.println("length = "+evenlyDivides3(46546));

    }
}
