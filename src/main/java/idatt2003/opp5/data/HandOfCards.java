package idatt2003.opp5.data;

import java.util.ArrayList;


public class HandOfCards extends DeckOfChards{
    
    private static ArrayList<PlayingCard> hand = new ArrayList<>();

    public HandOfCards(String type, int number) {
            super(type, number);
    }
    
    public void createHand() {
        hand.clear();
        while (hand.size() < 5) {
            PlayingCard newCard = getRandomCard();
            if(newCard != null && !hand.contains(newCard)) {
                hand.add(newCard);
            }
        }
        
    }

    public PlayingCard getRandomCard() {
        int number = (int)(Math.random()*13) +1;
        int type = (int)(Math.random()*4);

        String[] card = {"S","H","D","C"};
        String randType = card[type];
        
        ArrayList<PlayingCard> singelCards = super.getDeck().getOrDefault(randType, new ArrayList<>());
        for(PlayingCard singelCard : singelCards) {
            if(singelCard.getNumber() == number) {
                return singelCard;
            }
        }
        return null;
    }

    public void printHand() {
        for(PlayingCard card : hand) {
            System.out.println(card);
        }

    }

    public static boolean checkForFlush() {
        return hand.stream().allMatch(card -> card.getType().equals(hand.get(0).getType()));
    }

    public int getSum() {
        int sum = 0;
        for(PlayingCard card : hand) {
            sum+=card.getNumber();
        }
        return sum;
    }

    public String checkForHeart() {
        String result = "";
        for(PlayingCard card : hand) {
            if(card.getType().equals("H")) {
                result += card + ", ";
            }
        }
        if(result.equals("")) {
            return "No Hearts in hand";
        }
        return "Hearts found: " + result;
    }

    public boolean checkForSpadeQueen() {
        return hand.stream().anyMatch(card -> card.toString().equals("S12"));
    }

    public String checkHand() {
        String result = "The total sum of cards are: " + getSum() + "\n";
        if(checkForFlush()) {
            result += "YOU HAVE A FLUSH!!!!\n";
        }
        if(checkForSpadeQueen()) {
            result += "You the Qeen of Spade in your hand!\n";
        }
        if(!checkForSpadeQueen()) {
            result += "You do not have the Qeen of Spade in your hand!\n";
        }
        result += checkForHeart();
        return result;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
}
