package com.example.myapplication.behavioral.observer;


public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Semaforo semaforo);
}
