package com.example.myapplication.behavioral.iteractor;

public interface ItIterator {

    //Nos indica si hay más elementos o no.
    boolean hasNext();

    //Devuelve el siguiente elemento
    Object next();

    Object currenItem();

}
