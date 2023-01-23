package com.example.lacture03;

import java.util.ArrayList;
import java.util.Collections;
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

    /**
     * This method will deal the card from the top of the deck
     */
    public Card dealTopCard()
    {
        if(deck.size() > 0){
            return deck.remove(0);
        } else {
            return null;
        }
    }

    /**
     * This will shuffle the Deck
     */
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
