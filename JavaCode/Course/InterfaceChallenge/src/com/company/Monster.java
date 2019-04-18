package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/14/2017.
 *
 */
public class Monster implements I{
    private String name;
    private String health;
    private String Toughness;

    @Override
    public void fillOut(ArrayList<String> arrayList) {
        name = arrayList.get(0);
        health = arrayList.get(1);
        Toughness = arrayList.get(2);
    }

    @Override
    public ArrayList<String> returnData() {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add(name);
        ar.add(health);
        ar.add(Toughness);
        return ar;
    }

    @Override
    public String toString() {
        return name;
    }
}
