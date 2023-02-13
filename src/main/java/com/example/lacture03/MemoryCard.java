package com.example.lacture03;

public class MemoryCard extends Card{
    private boolean matched;

    public MemoryCard(String faceName, String suit) {
        super(faceName, suit); // this is calling the super class (Card) constructor
        this.matched = false;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }
}
