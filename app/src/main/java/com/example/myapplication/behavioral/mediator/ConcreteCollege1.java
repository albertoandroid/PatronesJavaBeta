package com.example.myapplication.behavioral.mediator;

import android.util.Log;

public class ConcreteCollege1 extends Colleague {

    public ConcreteCollege1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        Log.d("TAG1", "Collega 1 ha recibido el mensaje: " + message);
    }
}
