package com.example.myapplication.behavioral.observer;

public class Semaforo {

    public String semaforoStatus;

    public Semaforo (String semaforoStatus) {
        this.semaforoStatus = semaforoStatus;
    }

    public String getSemaforoStatus() {
        return semaforoStatus;
    }
}
