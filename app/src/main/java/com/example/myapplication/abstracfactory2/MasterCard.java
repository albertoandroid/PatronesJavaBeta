package com.example.myapplication.abstracfactory2;

//ConcreteProduct
public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getNumber() {
        return "0000 0000 MAST CARD";
    }
}
