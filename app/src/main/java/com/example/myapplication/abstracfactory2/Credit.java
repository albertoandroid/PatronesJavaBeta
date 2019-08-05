package com.example.myapplication.abstracfactory2;
//ConcreteProduct

public class Credit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a crédito";
    }
}
