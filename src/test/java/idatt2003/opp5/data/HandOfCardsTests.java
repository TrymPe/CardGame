package idatt2003.opp5.data;

import idatt2003.opp5.data.HandOfCards;
import  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import  org.junit.jupiter.api.Test;

public class HandOfCardsTests {
    @Test
    void testCreatHand() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.createHand();
        int handSize = hand.getHand().size();
        assertEquals(5, handSize);
    }
}
