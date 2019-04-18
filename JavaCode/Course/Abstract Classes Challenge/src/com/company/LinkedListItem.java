package com.company;

import java.util.ArrayList;

public class LinkedListItem extends ListItem {
    static ArrayList<Character> alphabet = new ArrayList<Character>();
    public LinkedListItem(String value) {
        super(value);
        setRight(null);
        setLeft(null);
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
    }

    @Override
    public int compareTo(ListItem other)  {
        boolean stop = false;
        int i = 0;
        if(this.getValue() == other.getValue()){
            return 0;
        }
        while(!stop){
            if(i==this.getValue().length()-1 || i== other.getValue().length()-1){
                stop = true;
            }
            if(this.getNumericalValue(this.getValue().charAt(i)) > getNumericalValue(other.getValue().charAt(i))){
                return 1;
            }else if(this.getNumericalValue(this.getValue().charAt(i)) < getNumericalValue(other.getValue().charAt(i))){
                return -1;
            }
            i++;
        }
        return 0;
    }
    public static int getNumericalValue(char character){
        for(int i=0; i<alphabet.size(); i++){
            if(character == alphabet.get(i)){
                return i;
            }
        }
        return -1;
    }
}