package com.example.myapplication.abstracfactory2;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getNumber() {
        return "0000 0000 0000 VISA";
    }
}
