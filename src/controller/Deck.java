package controller;

import java.util.HashSet;
import java.util.Random;

public class Deck {

    HashSet<Card> deck;
    HashSet<Card> table;

    public Deck() {
        this.deck = new HashSet<>();
        table = new HashSet<>();
        fillDeck();
    }

    private void fillDeck() {
        char swords = 's';
        char gold = 'g';
        char beakers = 'b';
        char clubs = 'c';

        for (int i = 0; i < 12; i++) {
            if (i != 7 && i != 8) {
                deck.add(new Card(swords, i + 1));
                deck.add(new Card(gold, i + 1));
                deck.add(new Card(beakers, i + 1));
                deck.add(new Card(clubs, i + 1));
            }
        }
    }

    //reparte 3 cartas aleatorias a cada jugador y las elimina de la baraja
    public void dealCards(Player[] player) {
        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < 3; j++) {
                Random rand = new Random();
                int index = rand.nextInt(deck.size());
                int k = 0;
                for (Card card : deck) {
                    if (k == index) {
                        player[i].getHand().add(card);
                        deck.remove(card);
                        break;
                    }
                    k++;
                }
            }
        }
    }

    //si no hay cartas en la mesa, descubre 4 cartas de la baraja
    public HashSet<Card> dealTableCards() {
        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            int index = rand.nextInt(deck.size());
            int j = 0;
            for (Card card : deck) {
                if (j == index) {
                    table.add(card);
                    deck.remove(card);
                    break;
                }
                j++;
            }
        }
        return table;
    }

    public HashSet<Card> getDeck() {
        return deck;
    }

    public HashSet<Card> getTable() {
        return table;
    }

    protected void printDeck() {
        System.out.println("Cards in the deck: " + deck.size());
        int counter = 1;
        for (Card c : deck) {
            System.out.println(counter + ": " +c.getValue() + " palo: " + c.getSuit());
            counter++;
        }
    }

}
