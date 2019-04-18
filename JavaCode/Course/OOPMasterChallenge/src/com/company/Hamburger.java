package com.company;

/**
 * Created by raahil on 6/17/2017.
 */
public class Hamburger {
    private String roll;
    private String meat;
    private double basePrice;
    private double additionPrice;
    private String additions = "";
    private int numAdditions = 0;
    private int maxAdditions = 4;

    public Hamburger(String roll, String meat, double price) {
        this.roll = roll;
        this.meat = meat;
        this.basePrice = price;
    }

    public void getPrice(){
        System.out.println("Grand total: " + (basePrice + additionPrice));
        System.out.println(additions);
    }

    public void addAdditions(String addition, double price){
        if (this.numAdditions + 1 <= maxAdditions) {
            this.additionPrice += price;
            this.numAdditions += 1;
            this.additions = this.additions + " " + addition + ", " + price + ";";
        } else {
            System.out.println("Maximum number of additions reached");
        }
    }

    public void changeMaxAdditions(int num){
        maxAdditions=num;
    }


}
