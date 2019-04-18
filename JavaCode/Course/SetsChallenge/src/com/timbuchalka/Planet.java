package com.timbuchalka;



public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod){
        super(name, orbitalPeriod, "Planet");

    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if(!getSatellites().contains(moon) && moon instanceof Moon) {
            return super.addMoon(moon);
        }else{
            return false;
        }
    }
}
