package com.example.myapplication.abstracfactory2;

import android.util.Log;

public class AbstractActivity {

    AbstractFactory abstractFactory;
    private void main(){
        abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");

        abstractFactory = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory.create("DEBIT");

        Log.d("TAG1", "una tarjeta" + tarjeta.getCardType() + "Con metodo de pago"+ paymentMethod.doPayment())

    }
}
