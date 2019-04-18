package com.company;

/**
 * Created by raahil on 7/3/2017.
 */
public class Contact {
    private String name;
    private int number;
    public Contact(String name, int number){
        this.name =name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
