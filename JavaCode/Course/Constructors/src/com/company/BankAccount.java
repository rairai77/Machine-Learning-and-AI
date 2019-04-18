package com.company;

/**
 * Created by raahil on 5/3/2017.
 */

public class BankAccount {
    //Vars
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount(){
        this("56789", 0d, "Default name", "default address", "default phone");//CONSTRUCTOR
    }
    public BankAccount(String accountNumber, double balance, String name, String email, String phone){//ANOTHER CONSTRUCTOR
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }


    //Balance Interaction
    public void deposit(double money) {
        this.balance += money;
        System.out.println("Deposit Complete!");
    }

    public void withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println("Withdrawal complete!");
        }
        else System.out.println("Insufficient funds");
    }

    //Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


}
