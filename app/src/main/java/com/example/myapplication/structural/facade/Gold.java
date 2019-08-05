package com.example.myapplication.structural.facade;

public class Gold implements Credit {

    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un credito 5.000");
    }
}
