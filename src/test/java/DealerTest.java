import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
  public Dealer dealer;
  public Deck deck;
  public Player player1;
  public Player player2;
  public Player player3;

  @Before
    public void setUp(){
      dealer = new Dealer();
      player1 = new Player("Robertee");
      player2 = new Player("Kylee");
      player3 = new Player("Ian");
      deck = new Deck();
  }

    @Test
    public void dealerStartsWithNaePlayers() {
      assertEquals(0, dealer.countPlayers());
    }

    @Test
    public void canAddPlayer() {
      dealer.addPlayer(player1);
      assertEquals(1, dealer.countPlayers());
    }

    @Test
    public void dealerCanDeal() {
      dealer.addPlayer(player1);
      dealer.dealCards(deck, 2);
      assertEquals(2, player1.countCards());
    }

    @Test
    public void dealerDeclearsWinners() {
      dealer.addPlayer(player1);
      dealer.addPlayer(player2);
      dealer.addPlayer(player3);
      player1.addCard(new Card(SuitType.DIAMONDS, CardRank.FOUR));
      player2.addCard(new Card(SuitType.SPADES, CardRank.FOUR));
      player3.addCard(new Card(SuitType.HEARTS, CardRank.SEVEN));
      assertEquals(1, dealer.checkWinner().size());
    }

    @Test
    public void dealerDeclearsMultipleWinners() {
        dealer.addPlayer(player1);
        dealer.addPlayer(player2);
        dealer.addPlayer(player3);
        player1.addCard(new Card(SuitType.DIAMONDS, CardRank.SIX));
        player2.addCard(new Card(SuitType.SPADES, CardRank.SIX));
        player3.addCard(new Card(SuitType.HEARTS, CardRank.THREE));
        assertEquals(2, dealer.checkWinner().size());
    }
}
