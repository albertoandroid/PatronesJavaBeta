package com.example.myapplication.abstracfactory2;

//Nos provee la factoria que queremos, si la de Card o PaymentMethodl
public class FactoryProvider {

    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        } else if("PaymentMethod".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
