package com.company;

/**
 * Created by raahil on 7/14/2017.
 * Edited by Raahil on 7/14/2017
 */
public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is already on.");
    }
    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering desk phone");
            isRinging = false;
        }
    }
    public void eat(){
        System.out.println("test");
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging=true;
            System.out.println("Ring ring");
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
