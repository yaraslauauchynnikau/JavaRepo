package com.example;

public class CardGame extends Game {
    private String deckType;

    public CardGame(String name, int id, int rating, String deckType) {
        super(name, id, rating);
        this.deckType = deckType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("   тип: карточная, колода: %s%n", deckType);
    }
}