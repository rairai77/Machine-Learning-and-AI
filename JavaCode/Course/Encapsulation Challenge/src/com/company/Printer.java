package com.company;

/**
 * Created by raahil on 5/21/2017.
 */
public class Printer {
    private int toner=100;
    private int pages=0;
    boolean duplex;

    public Printer(boolean duplex) {
        this.duplex = duplex;
    }
    public Printer(boolean duplex, int toner) {
        this.duplex = duplex;
        if(toner >= 100){
            this.toner = 100;
        } else if(toner<= 0){
            this.toner = 0;
        } else{
            this.toner = toner;
        }
    }

    public void addToner(int amnt){
        if(this.toner + amnt >= 100){
            this.toner = 100;
        } else if(this.toner + amnt <= 0){
            this.toner = 0;
        } else{
            this.toner += amnt;
        }
    }
    public void print(){
        this.pages++;
        this.toner--;
    }


}
