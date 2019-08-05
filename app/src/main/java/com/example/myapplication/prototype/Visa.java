package com.example.myapplication.prototype;

import android.util.Log;

public class Visa implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta Visa");
    }

    @Override
    public Visa clone() throws CloneNotSupportedException {
        Log.d("TAG1", "Clonando Tarjeta Visa");
        return (Visa) super.clone();
    }
}
