package com.company;

import java.util.ArrayList;

/**
 * Created by raahil on 7/11/2017.
 */
public class Album {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private String name;
    public Album(String name){
        this.name = name;
    }
    public void addSong(Song song){
        songs.add(song);
        System.out.println(song.getTitle() + " has been added to " + this.name);
    }
    public Song requestSong(String song){
        for(int i=0; i<songs.size(); i++){
            if(songs.get(i).getTitle()==song){
               return songs.get(i);
            }
        }
        return null;
    }

}
