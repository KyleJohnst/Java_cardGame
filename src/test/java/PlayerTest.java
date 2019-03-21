import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    public Player player1;
    public Player player2;
    public Card card1;
    public Card card2;

    @Before
    public void setUp(){
        player1 = new Player("Robertee");
        player2 = new Player("Kylee");
        card1 = new Card(SuitType.CLUBS, CardRank.JACK);
        card2 = new Card(SuitType.DIAMONDS, CardRank.FOUR);
    }

    @Test
    public void playerHasName() {
        assertEquals("Robertee", player1.getName());
    }

    @Test
    public void playerHasNoCards() {
        assertEquals(0, player2.countCards());
    }

    @Test
    public void playerCanReceiveCard() {
        player1.addCard(card1);
        assertEquals(1, player1.countCards());
    }

    @Test
    public void clearHandAfterRound() {
        player2.addCard(card1);
        player2.clearHand();
        assertEquals(0, player2.countCards());
    }

    @Test
    public void canTotalCards() {
        player1.addCard(card1);
        player1.addCard(card2);
        assertEquals(14, player1.getTotal());
    }
}
