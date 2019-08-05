package com.example.myapplication.behavioral.mediator;

//    Mediator: interfaz para comunicarse con los objetos.
public interface Mediator {
    void send(String message, Colleague colleague);
}
