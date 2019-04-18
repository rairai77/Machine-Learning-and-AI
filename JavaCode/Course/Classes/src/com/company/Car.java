package com.company;

/**
 * Created by raahil on 5/3/2017.
 */
public class Car {
    //Variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String getModel(){
        return this.model;
    }
    public int getDoors(){
        return this.doors;
    }



}
