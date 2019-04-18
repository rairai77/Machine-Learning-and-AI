package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));
        //Challenge
        for (int i = 2; i <= 8; i++) {
            System.out.println("10k at " + i + " % is " + String.format("%.2f", calculateInterest(10000d, i)));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("10k at " + i + " % is " + String.format("%.2f", calculateInterest(10000d, i)));
        }
        int primes = 0;
        for (int i = 1; i <= 100000; i++) {
            if(isPrime(i)){
                System.out.println(i);
                primes++;
            }
            if(primes == 100){
                break;
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <=n/2; i ++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
