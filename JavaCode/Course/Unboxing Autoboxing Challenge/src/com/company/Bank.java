package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/4/2017.
 */
public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(String name){
        if(findBranch(name)==-1)branches.add(new Branch(name));
    }
    public void addCustomerToBranch(String branchName, String customerName, double amnt){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            branches.get(branchIndex).addCustomer(new Customer(customerName, amnt));
        }else{
            System.out.println("Branch not on file");
        }
    }
    public void printCustomersInBranch(String name, boolean transactions){
        int branchIndex = findBranch(name);
        if(branchIndex >= 0){
            if(transactions){
                branches.get(branchIndex).printCustomersAndTransactions();
            }else{
                branches.get(branchIndex).printCustomers();
            }
        }else{
            System.out.println("Branch not on file");
        }
    }
    public void addTransaction(String branchName, String customerName, double amnt){
        int branchIndex = findBranch(branchName);
        if(branchIndex >= 0){
            branches.get(branchIndex).addTransaction(customerName, amnt);
        }else{
            System.out.println("Branch not on file");
        }
    }

    private int findBranch(String branchName){
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getName() == branchName){
                return i;
            }
        }
        return -1;
    }
}
