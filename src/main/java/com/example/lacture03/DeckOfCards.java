package com.example.lacture03;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    /**
     * This is constructor, it will allocate mamory for a deck of card objects
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        List<String> faceNames = Card.getValidFaceNames();
        List<String> suits = Card.getValidSuitNames();
        for(String suit : suits) {
            for(String faceName : faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
    }
}
