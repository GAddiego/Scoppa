package Principal;

import controller.Card;
import controller.Deck;
import controller.Player;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Gonzalo
 */
public class Scoppa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
        
        Deck deck = new Deck();
        System.out.println("deck size: " + deck.getDeck().size());
        for(Card card : deck.getDeck()){
            System.out.println(card.getSuit() + card.getValue());
        }
        
        deck.dealCards(players);
        deck.dealTableCards();
        
        deck.getTable().forEach(card -> {
            System.out.println(card.getSuit() + "!!!!!! " + card.getValue());
            System.out.println(deck.getTable().size());
        });
    }
    
}
