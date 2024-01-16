package controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;

public class Card {

    //Determines the suit of the card: s - swords, g - gold, b - beakers, c - clubs;
    char suit;
    int value;
    private BufferedImage cardsImage; // La imagen completa de la baraja
    private int x, y, width, height; // Coordenadas y dimensiones de la región de la carta en la imagen

    boolean visible = false;

    public Card(char suit, int value) throws IOException {
        loadCards();
        this.suit = suit;
        this.value = value;
        width = 208;
        height = 319;
        imageSelector(suit, value);
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
        if (this == obj) {
            return true;
        }
        if ((obj == null) || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        return this.getValue() == (card.getValue()) && this.getSuit() == (card.getSuit());
    }

    // Override the hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    private void imageSelector(char suit, int value) {
        switch (suit) {
            case 'g': //oros
                y = height*0;
                break;
            case 'b': //copas
                
                y = height*1;
                break;
            case 's': //swords
                
                y = height*2;
                break;
            case 'c': //bastos
                y = height*3;
                break;
            default:
                throw new AssertionError();
        }
        switch (value) {
            case 1:
                y = width*0;
                break;
            case 2:
                
                y = width*1;
                break;
            case 3:
                y = width*2;
                break;
            case 4:
                y = width*3;
                break;
            case 5:
                y = width*4;
                break;
            case 6:
                y = width*5;
                break;
            case 7:
                y = width*6;
                break;
            case 8:
                y = width*7;
                break;
            case 9:
                y = width*8;
                break;
            case 10:
                y = width*9;
                break;
            case 11:
                y = width*10;
                break;
            case 12:
                y = width*11;
                break;
            default:
                throw new AssertionError();
        }
    }

    private void loadCards() throws IOException{
        cardsImage = ImageIO.read(new File("images/Baraja_espanola_completa.png"));
    }

}
