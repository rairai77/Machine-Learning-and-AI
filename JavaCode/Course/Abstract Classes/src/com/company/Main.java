package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian");
        parrot.fly();
        parrot.eat();
        parrot.breathe();
    }
}
