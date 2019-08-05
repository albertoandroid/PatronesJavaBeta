package com.example.myapplication.structural.decorator;

/*
Clases concretas decorator que extiende de credit decorator

 */
public class SecureDecorator extends CreditDecorator {

    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();
    }

    private void configSecure(){
        System.out.println("Tarjeta configurada segura");
    }
}
