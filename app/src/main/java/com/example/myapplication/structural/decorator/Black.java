package com.example.myapplication.structural.decorator;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("El crédito es de 1000000");
    }
}
