package idatt2003.opp5;

import java.util.ArrayList;

import idatt2003.opp5.data.HandOfCards;
import idatt2003.opp5.data.PlayingCard;
import idatt2003.opp5.view.JavaFxTest;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public ArrayList<PlayingCard> startData() {
        HandOfCards hand = new HandOfCards("",0);

        hand.createDeck();
        hand.createHand();
        while (!hand.checkForFlush()) {
            hand.createHand();   
        }
        return hand.getHand();
    }
    
    @Override
    public void start(Stage stage){
        ArrayList<PlayingCard> hand = startData();

        Label label = new Label("Hello");
        Pane root = new Pane();
        Button button = new Button("B-For Button");
        button.setLayoutX(1000);
        button.setLayoutY(200);
        button.setOnAction(e -> button.setLayoutX(button.getLayoutX() + 10));
        
        Scene scene = new Scene(root, 1200,800);
       
        root.getChildren().add(label);
        root.getChildren().add(button);

        stage.setTitle("JavaFx Test");
        stage.setFullScreen(false);
        stage.setScene(scene);
        stage.show();
    }
}