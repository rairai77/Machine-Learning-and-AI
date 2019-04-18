package com.company;

import com.series.Series;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0; i<=10; i++){
            System.out.println(Series.nSum(i));
        }
        for(int i = 0; i<=10; i++){
            System.out.println(Series.nFactorial(i));
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.nFibonacci(i));
        }
        System.out.println("Possible Failing Cases");
        Series.nFibonacci(-5);
        Series.nFactorial(-5);
        Series.nSum(-5);
    }
}
