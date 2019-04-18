package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/14/2017.
 */
public class Player implements I{
    private String name;
    private int health;
    private int Toughness;

    @Override
    public void fillOut(ArrayList<String> arrayList) {
        name = arrayList.get(0);
        health = Integer.parseInt(arrayList.get(1));
        Toughness = Integer.parseInt(arrayList.get(2));
    }

    @Override
    public ArrayList<String> returnData() {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add(name);
        ar.add(Integer.toString(health));
        ar.add(Integer.toString(Toughness));
        return ar;
    }

    @Override
    public String toString() {
        return name;
    }
}
