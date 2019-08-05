package com.example.myapplication.builder;

/*
Nuestro objeto Card es nuestro producto. Por supuesto se compondrá de muchos atributos,
para este tutorial lo hemos limitado a dos, pero podría ser mayor.
 */
public class Card {

    private int number;
    private String material;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
