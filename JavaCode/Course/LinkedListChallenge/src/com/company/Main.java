package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Album album1 = new Album("Album 1");
        album1.addSong(new Song("Fire", 1));
        album1.addSong(new Song("Charge", 3));
        album1.addSong(new Song("poop",4));

        Playlist myPlay = new Playlist();
        myPlay.addSong(album1, "Fire");
        myPlay.addSong(album1, "Charge");
        myPlay.addSong(album1, "cantor");
        myPlay.printSongs();
        myPlay.nextSong();
        myPlay.previousSong();
        myPlay.replaySong();
        myPlay.removeSong();
        myPlay.printSongs();
    }
}
