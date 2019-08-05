package com.example.myapplication.structural.decorator;

/*
clase abstractar decorator implemente la interfaz credit
 */
public class CreditDecorator implements Credit {

    protected Credit decoratedCredit;

    public CreditDecorator(Credit decoratedCredit){
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
    }
}
