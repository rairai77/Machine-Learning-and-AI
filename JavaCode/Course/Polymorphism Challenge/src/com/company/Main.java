package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Car engine started");
    }

    public void accelerate(){
        System.out.println("Car accelerating");
    }

    public void brake(){
        System.out.println("Car braking");
    }
}
class Bugatti extends Car{
    public Bugatti() {
        super(20, "Bugatti");
    }

    @Override
    public void startEngine() {
        System.out.println("Bugatti engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bugatti accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bugatti braking");
    }
}
class Lamborgini extends Car{
    public Lamborgini() {
        super(10, "Lamborghini");
    }

    @Override
    public void startEngine() {
        System.out.println("Lamborghini engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Lamborghini accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Lamborghini braking");
    }
}
class Ferrari extends Car{
    public Ferrari() {
        super(5, "Ferrari");
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari braking");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
