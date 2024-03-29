import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public int countCards() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public void clearHand() {
        this.hand.clear();
    }

    public int getTotal() {
        int total = 0;
        for(Card card : hand){
            total += card.getValueFromEnum();
        }
        return total;
    }
}

