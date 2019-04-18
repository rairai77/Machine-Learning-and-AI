package com.company;

public class Main {
    //TODO create scanner
    public static void main(String[] args) {
	// write your code here
        Bank myBank = new Bank();

        myBank.addBranch("1");
        myBank.addBranch("2");
        myBank.addBranch("3");

        myBank.addCustomerToBranch("1", "Billy",.25);
        myBank.addCustomerToBranch("1","Sally",6);
        myBank.addTransaction("1", "Billy", 7);

        myBank.printCustomersInBranch("1",true);/

    }
}
