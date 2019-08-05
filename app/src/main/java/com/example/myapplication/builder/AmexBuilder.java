package com.example.myapplication.builder;

public class AmexBuilder extends CardBuilder {

    @Override
    public void buildNumber() {
        card.setMaterial("1234 1234 1234 1234");
    }

    @Override
    public void buildMaterial() {
        card.setMaterial("Plastico");
    }
}
