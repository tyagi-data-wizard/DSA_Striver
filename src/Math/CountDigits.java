package Math;

public class CountDigits {

    static int evenlyDivides(int N){
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

        int count = evenlyDivides(45);
        System.out.println(count);


    }
}
