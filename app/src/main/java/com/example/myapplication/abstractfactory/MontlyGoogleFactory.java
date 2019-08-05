package com.example.myapplication.abstractfactory;

public class MontlyGoogleFactory extends AbstractFactory {
    @Override
    public Payment createPayment() {
        return new GooglePayment();
    }

    @Override
    public Method createMethod() {
        return new MontlyMethod();
    }
}
