package MediumArrayProblem;

import java.util.Scanner;


public class StockBuyAndSell {

    static int calcProfitOptimal(int[] arr){
        //7 1 2 4 6 3
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i  = 0;i<arr.length;i++){
            if(buy>arr[i]){
                buy=arr[i];
            }else{
                if(sell<arr[i]){
                    sell = arr[i];
                }
            }

        }
        return sell-buy;
    }

static int calcProfitOptimalSecond(int[] arr){
    //7 1 2 4 6 3
    int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE;
    int maxProfit = Integer.MIN_VALUE;

    for(int i  = 0;i<arr.length;i++){
        if(buy>arr[i]){
            buy=arr[i];
        }else if(maxProfit<arr[i]-buy){
                maxProfit=arr[i]-buy;
            }

    }
    return maxProfit;
}

    static int calcProfitBrute(int[] arr){
        int maxProfit = Integer.MIN_VALUE;
        int profit;
        //7 1 2 4 6 3
        int start = 0,end=0;
        for (int i = 0; i <arr.length; i++) {

            for (int j = i+1; j < arr.length; j++){
                profit=(arr[j]-arr[i]);
                if(maxProfit<profit){
                    maxProfit = profit;
                }
            }

        }
        return maxProfit;

    }

    static Scanner sc = new Scanner(System.in);


    public static int[] inputArray(){
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {

//        int[] arr = inputArray();
        int[] arr = {7,1,5,3,6,4};

        System.out.println("The max profit is: "+calcProfitBrute(arr));
        System.out.println("The max profit by optimal is: "+calcProfitOptimal(arr));
        System.out.println("The max profit by optimal second is: "+calcProfitOptimalSecond(arr));

    }
}
