package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/4/2017.
 */
public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addTransaction(String customerName, double amnt){
        int customerIndex = findCustomer(customerName);
        if(customerIndex>=0){
            customers.get(customerIndex).addTransaction(amnt);
        }else{
            System.out.println("Customer not on file");
        }
    }
    public void printCustomers(){
        for(int i=0; i < customers.size(); i++){
            System.out.println("Customer " + customers.get(i).getName());
        }
    }
    public void printCustomersAndTransactions(){
        for(int i=0; i < customers.size(); i++){
            System.out.println("Customer:   " + customers.get(i).getName());
            System.out.print("Transactions:   ");
            for(int j=0; j < customers.get(i).getTransactions().size(); j++){
                double transaction = customers.get(i).getTransactions().get(j);
                System.out.print(transaction + ",  ");
            }
            System.out.println();
        }

    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public String getName() {
        return name;
    }

    private int findCustomer(String customerName){
        for(int i=0; i < customers.size(); i++){
            if(customers.get(i).getName() == customerName) {
                return i;
            }
        }
        return -1;
    }
}
