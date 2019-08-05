package com.example.myapplication.structural.facade;

public class Silver implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un credito 200.000");
    }
}
