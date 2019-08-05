package com.example.myapplication.structural.adapter;

public class CreditCard implements Payment {

    CardAdapter cardAdapter;

    @Override
    public void pay(String type) {
        if(type.equals("classic")){
            System.out.println("Tarjeta Classic - Pagando de Sin Seguridad");
        }else if(type.equals("gold")){
            cardAdapter = new CardAdapter("gold");
            cardAdapter.pay("gold");
        }else if(type.equals("black")) {
            cardAdapter = new CardAdapter("black");
        }
        else{
            System.out.println("No se puede hacer el pago, no se reconoce tipo de tarjeta");
        }
    }
}
