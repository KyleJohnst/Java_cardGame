import java.util.ArrayList;

public class Dealer {
    public ArrayList<Player> players;

    public Dealer(){
        this.players = new ArrayList<Player>();
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealCards(Deck deck, int amount) {
        for (Player player : players){
            for (int i = 0; i < amount; i++){
                player.addCard(deck.dealCard());
            }
        }
    }

    public ArrayList<Player> checkWinner() {
        ArrayList<Player> winningPlayers = new ArrayList<Player>();
        for (int i = 0; i < countPlayers(); i++){
            if (winningPlayers.size() == 0){
                winningPlayers.add(players.get(0));
            } else if(players.get(i).getTotal() == winningPlayers.get(0).getTotal()){
                winningPlayers.add(players.get(i));
            } else if (players.get(i).getTotal() > winningPlayers.get(0).getTotal()){
                winningPlayers.clear();
                winningPlayers.add(players.get(i));
            }
        }
        return winningPlayers;
    }
}



