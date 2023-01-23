package com.example.lacture03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Card {
    // faceName and suit are private instance variables
    // private meaning only ascessable inside this class
    private String faceName;
    private String suit;

    /*
     * This is called a constructor. This is a special "method" that does not have a return type and must have
     * exact same name as the class
     * @parama faceName "2", "3", "4", .... "9", "10", "Jack", "Queen", "King", "Ace"
     * @parama suit "hearts", "spades", "clubs", "diamonds"
     **/
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    /**
     * getters and setters
     */
    public String getFaceName() {
        return faceName;
    }

    /**
     * This method returns a list of valid faceNames
     */
    public  static List<String> getValidFaceNames()
    {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
    }

    /**
     * This will ensure we have a valid faceNames before setting the instance
     * variable
     * @parama faceName "2", "3", "4", .... "9", "10", "Jack", "Queen", "King", "Ace"
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();

//        List<String> validFaceNames = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
        List<String> validFaceNames = getValidFaceNames();
        if(validFaceNames.contains(faceName))
        {
            this.faceName = faceName;
        } else{
            throw new IllegalArgumentException(faceName + " was received, valid options are " + validFaceNames);
        }
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method returns a list of valid suit names
     */
    public static List<String> getValidSuitNames() {
        return Arrays.asList("hearts", "spades", "clubs", "diamonds");
    }

    /**
     * This will ensure we have a valid suit before setting the instance
     * variable
     * @parama suit "hearts", "spades", "clubs", "diamonds"
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        // Create a List of valid card suit names
        List<String> validSuits = getValidSuitNames();

        // if the argument (suit) passed into the method is valid, set the instance variable,
        // otherwise throw an exception to stop the program
        if(validSuits.contains(suit))
        {
            this.suit = suit;
        } else{
            throw new IllegalArgumentException(suit + " was received, valid options are " + validSuits);
        }
    }

    /**
     * This method returns the value of the card
     */
    public  int getValue()
    {
        return getValidFaceNames().indexOf(faceName) + 2;
    }

    /**
     * This method returns the color of card
     */
    public String getColor()
    {
        if(suit.equals("hearts") || suit.equals("diamonds"))
        {
            return "red";
        } else{
            return "black";
        }
    }

    /**
     * This method returns the Image location
     */
    public String getImage()
    {
        return null;
    }

    /**
     * This will return the String with the card name and suit
     */
    public String toString()
    {
        return faceName + " of " + suit;
    }
}
