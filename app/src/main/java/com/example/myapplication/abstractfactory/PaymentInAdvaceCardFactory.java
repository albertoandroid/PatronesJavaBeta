package com.example.myapplication.abstractfactory;

public class PaymentInAdvaceCardFactory extends AbstractFactory {

    @Override
    public Payment createPayment() {
        return new CardPayment();
    }

    @Override
    public Method createMethod() {
        return new PaymentInAdvanceMethod();
    }
}
