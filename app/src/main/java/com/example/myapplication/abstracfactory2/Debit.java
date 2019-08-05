package com.example.myapplication.abstracfactory2;
//ConcreteProduct

public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a Debito";
    }
}
