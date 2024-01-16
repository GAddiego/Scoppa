package controller;

import java.util.HashSet;
import java.util.Set;

public class Player {

    HashSet<Card> hand;
    HashSet<Card> gathered;

    public Player() {
        hand = new HashSet<>();
        gathered = new HashSet<>();
    }
    
    public Set<Card> getHand() {
        return hand;
    }

    public void setHand(HashSet<Card> hand){
        this.hand = hand;
    }

    public HashSet<Card> getGathered() {
        return gathered;
    }

    public void setGathered(HashSet<Card> gathered) {
        this.gathered = gathered;
    }

}

