package com.example.myapplication.builder;

/*
Nuestro Builder. Que ha de tener:
1.- Un método para devolver el Producto.
2.- Los metodos necesarios para su construcción.
 */
public abstract class CardBuilder {

    protected Card card;

    public Card getCard(){
        return card;
    }

    public void createCard(){
        card = new Card();
    }

    public abstract void buildNumber();
    public abstract void buildMaterial();
}
