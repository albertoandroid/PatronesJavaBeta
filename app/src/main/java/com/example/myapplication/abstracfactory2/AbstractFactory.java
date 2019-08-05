package com.example.myapplication.abstracfactory2;
//AbstractFactory: Interfaz para la creación de objetos de productos abstractos.
public interface AbstractFactory<T> {
    T create(String type) ;
}
