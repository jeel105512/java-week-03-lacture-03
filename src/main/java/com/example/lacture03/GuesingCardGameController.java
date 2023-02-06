package com.example.lacture03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class GuesingCardGameController {

    @FXML
    private ImageView cardImage0;

    @FXML
    private ImageView cardImage1;

    @FXML
    private ImageView cardImage2;

    @FXML
    private ImageView cardImage3;

    @FXML
    private ImageView cardImage4;

    @FXML
    private ImageView cardImage5;

    @FXML
    private ImageView cardImage6;

    @FXML
    private ImageView cardImage7;

    @FXML
    private Label correctLabel;

    @FXML
    private Label guessNumberLabel;

    @FXML
    private Label percentCorrectLabel;

    @FXML
    private HBox row1HBox;

    @FXML
    private HBox row2HBox;

    @FXML
    void playAgain(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resourceBundle){
        //This is the "long" way that calls each ImageView object directory
        Image backOfCard = new Image(Card.class.getResourceAsStream("images/back_of_card.png"));
        cardImage0.setImage(backOfCard);
        cardImage1.setImage(backOfCard);
        cardImage2.setImage(backOfCard);
        cardImage3.setImage(backOfCard);

        //We can also achieve this by looping over all the "Node's" in HBox container
        for(Node node : row2HBox.getChildren()){
            //Cast the Node to be ImageView object. This is sort of like saying
            //It's a car versus it's a BMW
            ImageView imageView = (ImageView) node;
            imageView.setImage(backOfCard);
        }
    }
}
