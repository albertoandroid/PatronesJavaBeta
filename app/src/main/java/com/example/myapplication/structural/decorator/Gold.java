package com.example.myapplication.structural.decorator;

//Clases concretas de Credit
public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("El Crédito es de 5000");
    }

}
