package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/4/2017.
 */
public class Customer {
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, double amnt) {
        this.name = name;
        transactions.add(amnt);
    }
    public void addTransaction(double amnt){
        transactions.add(amnt);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
}
