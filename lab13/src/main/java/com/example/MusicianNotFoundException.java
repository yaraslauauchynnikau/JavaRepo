package com.example;

public class MusicianNotFoundException extends Exception {
    private String name;

    public MusicianNotFoundException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}