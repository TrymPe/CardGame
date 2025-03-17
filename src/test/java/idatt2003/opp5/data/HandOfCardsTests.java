package idatt2003.opp5.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import  org.junit.jupiter.api.Test;

public class HandOfCardsTests {
    @Test
    void testCreatHand() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.createDeck();
        hand.createHand();
        int handSize = hand.getHand().size();
        assertEquals(5, handSize);
    }

    @Test
    void testCheckForFlush() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.getHand().clear();
        PlayingCard card = new PlayingCard("H", 1);
        hand.getHand().add(card);
        assertTrue(hand.checkForFlush());
    }

    @Test
    void testCheckForHeart() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.getHand().clear();
        PlayingCard card = new PlayingCard("H", 1);
        hand.getHand().add(card);
        assertEquals("Hearts found: H1, ",hand.checkForHeart());
    }   

    @Test
    void testCheckForNotHeart() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.getHand().clear();
        PlayingCard card = new PlayingCard("S", 1);
        hand.getHand().add(card);
        assertNotEquals("Hearts found: H1, ",hand.checkForHeart());
    }   

    @Test
    void testCheckForQeen() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.getHand().clear();
        PlayingCard card = new PlayingCard("S", 12);
        hand.getHand().add(card);
        assertTrue(hand.checkForSpadeQueen());
    }

    @Test
    void testCheckForNotQeen() {
        HandOfCards hand = new HandOfCards(null, 0);
        hand.getHand().clear();
        PlayingCard card = new PlayingCard("D", 12);
        hand.getHand().add(card);
        assertFalse(hand.checkForSpadeQueen());
    }
}
