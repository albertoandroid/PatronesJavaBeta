package com.example.myapplication.behavioral.mediator;

import android.util.Log;
/*
ConcreteCollegaue: Cada objeto conoce su mediator, y lo usa para comunicarse
        con otros colegas.
        */
public class ConcreteCollege2 extends Colleague {

    public ConcreteCollege2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        Log.d("TAG1", "Collega 2 ha recibido el mensaje: " + message);
    }
}
