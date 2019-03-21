import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to HighHands");
        Dealer dealer = new Dealer();
        Deck deck = new Deck();

//        Get how many players
        Scanner reader = new Scanner(System.in);
        System.out.println("Input how many players");
        int playerCount = reader.nextInt();


//        Create new players and add to dealer
        for (int i = 0; i < playerCount; i++){
            System.out.println("Input player name");
            String playerName = reader.next();
            dealer.addPlayer(new Player(playerName));
        }

        System.out.println("How many cards per player?");
        int handCards = reader.nextInt();
        reader.close();

        dealer.dealCards(deck,handCards);
        for(Player player : dealer.players){
            System.out.println("Player: " + player.getName() + " has a hand total of " + player.getTotal() );
        }
        if(dealer.checkWinner().size() > 1){
            System.out.println("Its a draw between: ");
            for(Player player : dealer.checkWinner()) {
                System.out.println(player.getName());
            }
            }else if (dealer.checkWinner().size() == 1){
            System.out.println("The winner is: " + dealer.checkWinner().get(0).getName() + " with a hand total of: " + dealer.checkWinner().get(0).getTotal());
            }
        }
    }
