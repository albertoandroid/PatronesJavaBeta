package com.example.myapplication.structural.flyweight;

public class Detective implements Enemy {

    private String weapong;

    private final String LIFE;

    public Detective(){
        LIFE = "1000";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapong = weapon;
    }

    @Override
    public void lifePoints () {
        System.out.println("La vida de un TENIENTE es: " + LIFE);
    }
}
