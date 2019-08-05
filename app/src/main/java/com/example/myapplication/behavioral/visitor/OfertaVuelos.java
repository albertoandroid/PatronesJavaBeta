package com.example.myapplication.behavioral.visitor;

public class OfertaVuelos implements OfertaVisitable {
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
}
