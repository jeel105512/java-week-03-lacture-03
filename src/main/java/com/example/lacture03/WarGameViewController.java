package com.example.lacture03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class WarGameViewController implements Initializable {

    @FXML
    private Label faceNameLabel;
    @FXML
    private ImageView imageView;
    @FXML
    private Label suitNameLabel;
    @FXML
    private Label valueLabel;
    private DeckOfCards deck;

    @FXML
    void nextCard() {
        Card card = deck.dealTopCard();
        imageView.setImage(card.getImage());
        faceNameLabel.setText(card.getFaceName());
        suitNameLabel.setText(card.getSuit());
        valueLabel.setText(Integer.toString(card.getValue()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        deck.shuffle();
        nextCard();
    }
}