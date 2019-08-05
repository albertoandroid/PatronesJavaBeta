package com.example.myapplication.abstractfactory;

public class PaymentMethodManager {

    public PaymentMethodManager(AbstractFactory factory){
        Payment payment = factory.createPayment();
        Method method = factory.createMethod();
        payment.doPayment();
        method.calculePayment();
    }
}
