package com.example;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, int id, int rating, String platform) {
        super(name, id, rating);
        this.platform = platform;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: видеоигра, платформа: %s%n", platform);
    }
}