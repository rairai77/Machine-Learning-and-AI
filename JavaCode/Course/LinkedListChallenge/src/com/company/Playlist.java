package com.company;

import java.util.LinkedList;

/**
 * Created by raahil on 7/11/2017.
 */
public class Playlist {
    private LinkedList<Song> songs = new LinkedList<Song>();
    private int songNumber = 0;
    public void addSong(Album album, String song) {
        if (album.requestSong(song) != null) {
            songs.add(album.requestSong(song));
        } else System.out.println(song+" does not exist! Also, YOU ARE A FAILURE IN LYFE");
    }
    public void printSongs(){
        for (Song song:songs) {
            System.out.println(song.getTitle());
        }
    }
    public void nextSong(){
        if(songNumber+1 > songs.size()){
            songNumber = 0;
        }
        else songNumber++;
        System.out.println("Now playing " + songs.get(songNumber).getTitle());
    }
    public void previousSong(){
        if(songNumber!=0){
            songNumber--;
            System.out.println("Now playing " + songs.get(songNumber).getTitle());
        }else{
            System.out.println("Now playing " + songs.get(songNumber).getTitle());
        }
    }
    public void replaySong(){
        System.out.println("Now playing " + songs.get(songNumber).getTitle());
    }
    public void removeSong(){
        System.out.println(songs.get(songNumber).getTitle()+" has been removed! There is no getting it back MWAHAHAHAHAHAHAHAHAHA, MWAHAHAHAHAHAHA I'm just kidding");
        songs.remove(songNumber);
    }
}
