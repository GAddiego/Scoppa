package controller;

import Principal.Scoppa;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Controller extends JFrame{

    private Player[] players;
    private Deck deck;
    private HashSet<Card> tableCards;
    
        
    
    public Controller(int numberOfPlayers){
        
        players = new Player[numberOfPlayers];
        createPlayers(numberOfPlayers);
        
        deck = new Deck();
        deck.dealCards(players);
        
        tableCards = deck.dealTableCards();
        
    }

    private void createPlayers(int n) {
        for(int i=0; i<n; i++){
            players[i] = new Player();
        }
    }
    
}
