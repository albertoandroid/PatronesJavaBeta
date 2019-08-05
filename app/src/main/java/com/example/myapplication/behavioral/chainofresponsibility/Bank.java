package com.example.myapplication.behavioral.chainofresponsibility;

public class Bank implements ApproveLoanChain {

    /*
    En nuestro ejemplo es la clase tarjeta la que se encarga de organizar la
    cadena.
    Es decir para el cliente, la clase tarjeta, será el punto de entrada.



     */
    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        //Configuramos Chain of Responssability
        Gold gold = new Gold();
        this.setNext(gold);

        Platinium platinium = new Platinium();
        gold.setNext(platinium);

        Black black = new Black();
        platinium.setNext(black);

        next.creditCardRequest(totalLoan);
    }
}
