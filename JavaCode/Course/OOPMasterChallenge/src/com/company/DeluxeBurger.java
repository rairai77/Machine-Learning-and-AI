package com.company;

/**
 * Created by raahil on 6/17/2017.
 */
public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String bread, String meat, int price){
        super(bread, meat, price);
        changeMaxAdditions(2);
        addAdditions("Drink", .5);
        addAdditions("chips", .5);
    }
}
