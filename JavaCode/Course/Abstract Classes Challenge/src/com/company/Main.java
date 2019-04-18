package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedListItem one = new LinkedListItem("potato");
        LinkedListItem two = new LinkedListItem("tomato");
        LinkedListItem three = new LinkedListItem("carrot");

        MyLinkedList aLinkedList = new MyLinkedList();
        if(aLinkedList.add(one)){
            System.out.println("YAY");
        }
        else{
            System.out.println("BOOOO!!!");
        }
        if(aLinkedList.add(two)){
            System.out.println("YAY");
        }
        else{
            System.out.println("BOOOO!!!");
        }if(aLinkedList.add(three)){
            System.out.println("YAY");
        }
        else{
            System.out.println("BOOOO!!!");
        }
        aLinkedList.add(one);

        aLinkedList.printIteratedValue();
        aLinkedList.next();
        aLinkedList.printIteratedValue();
        aLinkedList.previous();
        aLinkedList.printIteratedValue();
    }

}
