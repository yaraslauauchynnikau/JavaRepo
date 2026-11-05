package com.example;

public class Game {
    private String name;
    private int id;
    private int rating;

    public Game(String name, int id, int rating) {
        this.name = name;
        this.id = id;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.printf("Игра: %s | ID: %d | Рейтинг: %d%n", name, id, rating);
    }
}