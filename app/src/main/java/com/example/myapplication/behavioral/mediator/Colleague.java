package com.example.myapplication.behavioral.mediator;

/*
Colleague: define el comportamiento que debe implementar cada objeto para
    poder comunicarse con el Mediador de una manera standard.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    //get access to the mediator
    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
