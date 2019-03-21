import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
 public Deck deck;

 @Before
    public void setUp(){
     deck = new Deck();
 }

//    @Test
//    public void testDeckIsOfEmpty() {
//     assertEquals(0, deck.countCards());
//    }

    @Test
    public void has52Cards() {
     assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard() {
     Card card = deck.dealCard();
     assert(card instanceof Card);
     assertEquals(51, deck.countCards());
    }
}
