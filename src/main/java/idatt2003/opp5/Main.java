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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public ArrayList<PlayingCard> startData() {
        HandOfCards hand = new HandOfCards("",0);

        hand.createDeck();
        hand.createHand();
        /* 
        while (!hand.checkForFlush()) {
            hand.createHand();   
        }
        */
        hand.printHand();
        return hand.getHand();
    }
    
    @Override
    public void start(Stage stage){
        ArrayList<PlayingCard> hand = startData();
        if(!HandOfCards.checkForFlush()) {
            String image1 = (hand.get(0) + ".png");
            Image card1 = new Image(getClass().getResource("imag/" + image1).toExternalForm());
            ImageView card1View = new ImageView(card1);
            card1View.setFitHeight(150);
            card1View.setFitWidth(100);
            card1View.setLayoutX(100);
            card1View.setLayoutY(400);

            String image2 = (hand.get(1) + ".png");
            Image card2 = new Image(getClass().getResource("imag/" + image2).toExternalForm());
            ImageView card2View = new ImageView(card2);
            card2View.setFitHeight(150);
            card2View.setFitWidth(100);
            card2View.setLayoutX(200);
            card2View.setLayoutY(400);

            String image3 = (hand.get(2) + ".png");
            Image card3 = new Image(getClass().getResource("imag/" + image3).toExternalForm());
            ImageView card3View = new ImageView(card3);
            card3View.setFitHeight(150);
            card3View.setFitWidth(100);
            card3View.setLayoutX(300);
            card3View.setLayoutY(400);

            String image4 = (hand.get(3) + ".png");
            Image card4 = new Image(getClass().getResource("imag/" + image4).toExternalForm());
            ImageView card4View = new ImageView(card4);
            card4View.setFitHeight(150);
            card4View.setFitWidth(100);
            card4View.setLayoutX(400);
            card4View.setLayoutY(400);

            String image5 = (hand.get(4) + ".png");
            Image card5 = new Image(getClass().getResource("imag/" + image5).toExternalForm());
            ImageView card5View = new ImageView(card5);
            card5View.setFitHeight(150);
            card5View.setFitWidth(100);
            card5View.setLayoutX(500);
            card5View.setLayoutY(400);

            Image dealer = new Image(getClass().getResource("imag/lugi.png").toExternalForm());
            ImageView dealerView = new ImageView(dealer);
            dealerView.setLayoutX(-50);

            Image bar = new Image(getClass().getResource("imag/bar.jpg").toExternalForm());
            ImageView barView = new ImageView(bar);
            barView .setLayoutX(40);

            Rectangle piller1 = new Rectangle(0,0,50,700);
            piller1.setFill(Color.DARKGREY);

            Rectangle piller2 = new Rectangle(650,0,500,700);
            piller2.setFill(Color.DARKGREY);

            Label label = new Label("Hello");
            Pane root = new Pane();
            root.setBackground(null);

            Button button = new Button("New Hand");
            button.setLayoutX(800);
            button.setLayoutY(200);
            button.setOnAction(e -> startData());
            button.setOnAction(e -> start(stage));
        

            
            Scene scene = new Scene(root, 1000,700, Color.LIGHTGREEN);
        
            root.getChildren().addAll(label, barView, piller1, piller2, button, dealerView, card1View, card2View, card3View, card4View, card5View);

            stage.setTitle("Cool Card Game :)");
            stage.setFullScreen(false);
            stage.setScene(scene);
        } else {
            Label label = new Label("YouWin!!!!");
            Pane root = new Pane();
            root.getChildren().add(label);
            Scene scene = new Scene(root, 1200,800);
            stage.setScene(scene);
        }
        
        stage.show();
    }
}