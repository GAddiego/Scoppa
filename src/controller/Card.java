package controller;

import java.util.Objects;

public class Card{
    //Determines the suit of the card: s - swords, g - gold, b - beakers, c - clubs;
    char suit;
    int value;
    boolean visible = false;
    

    public Card(char suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if((obj==null) || getClass() != obj.getClass()){
            return false;
        }
        Card card = (Card) obj;
        return this.getValue()==(card.getValue()) && this.getSuit() == (card.getSuit());
    }
    
    // Override the hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
    
}