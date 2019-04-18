package com.series;

public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
    public static int nFactorial(int n){
        if(n==0){
            return 0;
        }
        int product = 1;
        for(int i = 1; i<=n; i++){
            product*=i;
        }
        return product;
    }
    public static int nFibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return nFibonacci(n-1)+nFibonacci(n-2);
        }
    }
}
