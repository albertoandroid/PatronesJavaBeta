package com.example.myapplication.abstracfactory2;
//ConcreteFactory: Implementa la interfaz para la creación de objetos
// de productos concretos.

public class CardFactory implements AbstractFactory<Card> {

    @Override
    public Card create(String cardType) {
        if("VISA".equals(cardType)){
            return new Visa();
        } else if("MASTERCARD".equals(cardType)){
            return new MasterCard();
        }
        return null;
    }
}
