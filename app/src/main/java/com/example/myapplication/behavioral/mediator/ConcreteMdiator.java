package com.example.myapplication.behavioral.mediator;
/*
ConcreteMdiator: implementa la interfaz. Define como los objetos
        se comunicacna entre ellos. Además los conoce y mantiente.
        */
public class ConcreteMdiator implements Mediator {

    private ConcreteCollege1 user1;
    private ConcreteCollege2 user2;

    public void setColleage1(ConcreteCollege1 colleage1){
        user1 = colleage1;
    }

    public void setColleage2(ConcreteCollege2 colleage2){
        user2 = colleage2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague==user1){
            user2.messageReceived(message);
        }else if(colleague == user2){
            user1.messageReceived(message);
        }
    }
}
