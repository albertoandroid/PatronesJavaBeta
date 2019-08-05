package com.example.myapplication.structural.facade;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un credito 1.000.000");
    }
}
