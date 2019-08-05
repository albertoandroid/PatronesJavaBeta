package com.example.myapplication.structural.adapter;

public class CardAdapter implements Payment {

    Secure secureCreditCard;

    public CardAdapter(String type){
        if(type.equals("black")){
            secureCreditCard = new BlackCreditCard();
        } else if(type.equals("gold")){
            secureCreditCard = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if(type.equals("black")){
            secureCreditCard.payWithSecureLevelA();
        } else if(type.equals("gold")){
            secureCreditCard.payWithSecureLevelZ();
        }
    }
}
