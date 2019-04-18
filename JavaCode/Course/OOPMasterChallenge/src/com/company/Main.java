package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DeluxeBurger myBurger = new DeluxeBurger("Italian", "Pork", 2);
        myBurger.addAdditions("cheese", 5);
        myBurger.getPrice();
    }
}
