package com.company;

/**
 * Created by raahil on 6/17/2017.
 */
public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat, int price){
        super("Brown Rye", meat, price);
        changeMaxAdditions(6);
    }
}
