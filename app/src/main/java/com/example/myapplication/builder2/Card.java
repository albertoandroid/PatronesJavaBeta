package com.example.myapplication.builder2;

public class Card {

    //All final attributes
    private final String cardType; // required
    private final String number; // required
    private final String name; // optional
    private final int expired; // optional
    private final boolean credit; // optional

    private Card(CardBuilder builder){
        this.cardType = builder.cardType;
        this.credit = builder.credit;
        this.expired = builder.expired;
        this.name = builder.name;
        this.number = builder.number;
    }

    //All getter, and NO setter to provde immutability


    public String getCardType() {
        return cardType;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpired() {
        return expired;
    }

    public boolean isCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "CARD: " + cardType + " " + number + " " + expired + " " + name + " " + credit;
    }

    public static class CardBuilder{
        private String cardType; // required
        private String number; // required
        private String name; // optional
        private int expired; // optional
        private boolean credit; // optional

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name){
            this.name = name;
            return this;
        }

        public CardBuilder expires(int expires){
            this.expired = expires;
            return this;
        }

        public CardBuilder credit(Boolean credit){
            this.credit = credit;
            return this;
        }

        //Return the finally consrcuted User object
        public Card build() {
            return new Card(this);
        }
    }
}
