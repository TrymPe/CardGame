package idatt2003.opp5.data;

import java.util.ArrayList;
import java.util.HashMap;

public class DeckOfChards extends PlayingCard{
    DeckOfChards(String type, int number) {
            super(type, number);
            //TODO Auto-generated constructor stub
    }
    
    private HashMap<String,ArrayList<PlayingCard>> deckOfCards = new HashMap<String, ArrayList<PlayingCard>>();

    /*
     * S = Spades
     * H = Hearts
     * D = Diamonds
     * C = Clubs
     */

    /**
     * adds a new card to the deck.
     * 
     * @param newCard the new card
     */
    public void addNewCard(PlayingCard newCard) {
        if(!checkForCard(newCard)) {
            deckOfCards.putIfAbsent(newCard.getType(), new ArrayList<>());
            ArrayList<PlayingCard> cards = deckOfCards.get(newCard.getType());
            cards.add(newCard);
        }
    }

    /**
     *  Checks if the card allready exists.
     * 
     * @param newCard the new card
     * @return true if exists, false if not
     */
    public boolean checkForCard(PlayingCard newCard) {
        for(String type : deckOfCards.keySet()) {
            if(type.equals(newCard.getType())) {
                ArrayList<PlayingCard> cards = deckOfCards.get(newCard.getType());
                return cards.stream().anyMatch(card -> card.toString().equals(newCard.toString()));
            }
        }
        return false;
    }

    /**
     *  Creates the 52cards.
     */
    public void createDeck() {
        String type = "";
        for(int i = 0;i<4;i++) {
            for(int j=1;j<14;j++) {
                switch (i) {
                    case 0:
                        type = "S";
                        break;
                    case 1:
                        type = "H";
                        break;
                    case 2:
                        type = "D";
                        break;
                    case 3:
                        type = "C";
                        break;
                    default:
                        break;
                }
                addNewCard(new PlayingCard(type, j));
            }
        }
    }

    public HashMap<String,ArrayList<PlayingCard>> getDeck() {
        return this.deckOfCards;
    }
}