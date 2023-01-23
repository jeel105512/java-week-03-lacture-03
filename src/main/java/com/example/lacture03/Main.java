package com.example.lacture03;

public class Main {
    public static void main(String[] args) {
        // this will create an instance of a Card object
        // it holds the Ace of Spades
        Card aceOfSpaces = new Card("King", "Hearts");
        System.out.println(aceOfSpaces);
        System.out.println("Value of " + aceOfSpaces + ": " + aceOfSpaces.getValue());
        System.out.println("Color of " + aceOfSpaces + ": " + aceOfSpaces.getColor());

        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck);
    }
}
