package com.example.kevin.cardstack;

/**
 * Created by kevin on 10/2/2017.
 */

public class Card {
    public int cardNum;
    public String cardSuit;

    public Card(int cardNum, String cardSuit) {
        this.cardNum = cardNum;
        this.cardSuit = cardSuit;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }
}

