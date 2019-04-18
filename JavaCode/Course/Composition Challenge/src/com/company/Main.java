package com.company;

public class Main {

    public static void main(String[] args) {
        House myHouse = new House(new Wall("purple"), new Wall("purple"),new Wall("purple"),new Wall("purple"), new Chair("yellow"));
        myHouse.paintChair("purple");

    }
}
