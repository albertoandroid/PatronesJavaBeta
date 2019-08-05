package com.example.myapplication.abstracfactory2;
//ConcreteFactory: Implementa la interfaz para la creación de objetos
// de productos concretos.
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {

    @Override
    public PaymentMethod create(String paymentMethodType) {
        if("CREDIT".equals(paymentMethodType)){
            return new Credit();
        } else if("DEBIT".equals(paymentMethodType)){
            return new Debit();
        }
        return null;
    }
}
