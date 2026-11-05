package com.example;

class Song {
    private String title;
    private Genre genre;
    private Singer author;

    Song(String title, Genre genre, Singer author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Singer getAuthor() {
        return author;
    }
}