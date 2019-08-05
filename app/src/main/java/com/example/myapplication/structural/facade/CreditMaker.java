package com.example.myapplication.structural.facade;

/*
la clase facade
 */
public class CreditMaker {
    private Credit gold;
    private Credit silver;
    private Credit black;

    public CreditMaker(){
        gold = new Gold();
        silver = new Silver();
        black = new Black();
    }

    public void showCreditGold(){
        gold.showCredit();
    }

    public void showCreditSilver(){
        silver.showCredit();
    }

    public void showCreditBlack(){
        black.showCredit();
    }
}
