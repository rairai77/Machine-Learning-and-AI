package com.company;

/**
 * Created by raahil on 7/11/2017.
 */
public class Song {
    private String title;
    private double Duration;

    public Song(String title, int duration) {
        this.title = title;
        Duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return Duration;
    }
}
