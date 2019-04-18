package com.company;

/**
 * Created by raahil on 5/20/2017.
 */
public class House {
    private Wall leftWall;
    private Wall rightWall;
    private Wall frontWall;
    private Wall backWall;
    private Chair chair;

    public House(Wall leftWall, Wall rightWall, Wall frontWall, Wall backWall, Chair chair) {
        this.leftWall = leftWall;
        this.rightWall = rightWall;
        this.frontWall = frontWall;
        this.backWall = backWall;
        this.chair = chair;
    }

    public void paintChair(String colour){
        getChair().paint(colour);
    }

    public void paintRightWall(String colour){
        this.rightWall.paint(colour);
    }

    public Chair getChair() {
        return chair;
    }
}
