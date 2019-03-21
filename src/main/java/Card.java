public class Card {
    private SuitType suit;
    private CardRank rank;

    public Card(SuitType suit, CardRank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return this.suit;

    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }
}
