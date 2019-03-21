import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        this.getCards();
        this.shuffle();
    }

    public int countCards() {
        return cards.size();
    }

    public void getCards(){
        SuitType[] suitTypes = SuitType.values();
        CardRank[] cardRanks = CardRank.values();
        for(SuitType suit : suitTypes){
            for(CardRank rank : cardRanks){
                this.cards.add(new Card(suit, rank));
            }
        }
    }

//    public void shuffle(){ TOO EASY, WE LIKE PAIN
//        Collections.shuffle(cards);
//    }

    public void shuffle(){
        Random rand = new Random();
        for (int i = 0; i < countCards(); i++){
            int j = rand.nextInt(countCards()-1);
            Card tempCard = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, tempCard);
        }
    }


    public Card dealCard() {
        if (countCards() > 1){
            return cards.remove(countCards()-1);
        } else {
            return null;
        }
    }
}
