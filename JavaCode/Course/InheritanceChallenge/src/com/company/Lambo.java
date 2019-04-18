package com.company;

/**
 * Created by raahil on 5/6/2017.
 */
public class Lambo extends Car {
    private boolean sunRoof;

    public Lambo( boolean sunRoof) {
        super("Lamborghini", "awesome", 4, 4, 4, false);
        this.sunRoof = sunRoof;
    }

    public void sunRoofMode(boolean mode){
        this.sunRoof = mode;
        System.out.println("Sun roof is open? " + this.sunRoof);
    }

    public void acclerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        }
        else if (newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <=30){
            changeGear(2);
        }
        else if (newVelocity > 30 && newVelocity <=40){
            changeGear(2);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
