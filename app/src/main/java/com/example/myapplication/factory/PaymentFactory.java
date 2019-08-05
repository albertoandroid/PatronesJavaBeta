package com.example.myapplication.factory;
/*
Creator: Es donde se declara el método de fabricación (Factory Method) que devuelve un objeto
de tipo Producto.
 */
public class PaymentFactory implements PaymentFactoryMehtod {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD:
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new GooglePayment();
        }
    }
}
