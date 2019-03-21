import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void setUp(){
        card = new Card(SuitType.HEARTS, CardRank.KING);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValueFromCard() {
        assertEquals(10, card.getValueFromEnum());
    }

    //    @Test
//    public void canBeMissPelt() {
//        card = new Card("Heearts");
//        assertEquals("Heearts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}
