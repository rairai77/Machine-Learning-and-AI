package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/3/2017.
 */
public class MobilePhone {
    ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public void print(){
        for(int i =0; i < myContacts.size(); i++){
            System.out.println("Name :  " + myContacts.get(i).getName() + "   Number :  " + myContacts.get(i).getNumber());
        }
    }

    public void store(String name, int number){
        if(exists(name) >= 0){
            System.out.println("Contact cannot be added because it already exists");
        }
        else{
            myContacts.add(new Contact(name, number));
        }
    }
    public void modify(String name, String newName, int newNumber){
        int pos = exists(name);
        if(pos >= 0){
            myContacts.set(pos, new Contact(newName, newNumber));
        }
        else{
            System.out.println("Contact cannot be modified, it does not exist.");
        }
    }
    public void remove(String name){
        if(exists(name)>=0){
            myContacts.remove(exists(name));
        }
        else{
            System.out.println("Contact does not exist.");
        }

    }

    private int exists(String name){
        int position = -1;
        for(int i=0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName() == name){
                position = i;
            }
        }
        return position;
    }
}
