package com.example.myapplication.builder;

/*
Director: Los primero es indicar que tipo de Tarjeta queremos construir, Visa, Amex
para luego llamar al contructorCard.
 */
public class CardDirector {

    private CardBuilder cardBuilder;

    public void constructCard(){
        cardBuilder.createCard();
        cardBuilder.buildMaterial();
        cardBuilder.buildNumber();
    }

    public void setCardBuilder(CardBuilder cardBuilder){
        this.cardBuilder = cardBuilder;
    }

    public Card getCard(){
        return cardBuilder.getCard();
    }
}
