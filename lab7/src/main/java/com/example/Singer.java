package com.example;

import java.util.List;
import java.util.ArrayList;

class Singer {
    private String name;
    private Genre genre;
    private List<Song> songs = new ArrayList<>();

    static int totalSingers = 0;
    static int totalSongs = 0;

    Singer(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
        totalSingers++;
    }

    void addSong(String title, Genre genre) {
        songs.add(new Song(title, genre, this));
        totalSongs++;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Song> getSongs() {
        return songs;
    }

    static double getAverageSongs() {
        if (totalSingers == 0) {
            return 0;
        }
        return (double) totalSongs / totalSingers;
    }
}