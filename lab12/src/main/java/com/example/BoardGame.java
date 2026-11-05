package com.example;

public class BoardGame extends Game {
    private int players;

    public BoardGame(String name, int id, int rating, int players) {
        super(name, id, rating);
        this.players = players;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: настольная, игроков: %d%n", players);
    }
}