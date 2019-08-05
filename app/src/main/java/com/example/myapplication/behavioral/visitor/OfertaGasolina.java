package com.example.myapplication.behavioral.visitor;

public class OfertaGasolina implements OfertaVisitable {
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaGasolina(this);
    }
}
