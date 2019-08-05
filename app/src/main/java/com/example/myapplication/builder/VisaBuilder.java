package com.example.myapplication.builder;

/*
Concrete Builder: Son los que se encargan de la lógica de construcción
de cada tarjeta en particular.
 */
public class VisaBuilder extends CardBuilder {

    @Override
    public void buildNumber() {
        card.setMaterial("1234 1234 1234 1234");
    }

    @Override
    public void buildMaterial() {
        card.setMaterial("Plastico");
    }
}
