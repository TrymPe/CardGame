package idatt2003.opp5.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class DeckOfChardsTest {
    @Test
    void testCreateDeck () {
        DeckOfChards deck = new DeckOfChards(null, 0);
        deck.createDeck();
        int totalCard = 0;
        for(ArrayList<PlayingCard> cards : deck.getDeck().values()) {
            for(PlayingCard card : cards) {
                totalCard += 1;
            }
        }
        assertEquals(52, totalCard);
    }
}
