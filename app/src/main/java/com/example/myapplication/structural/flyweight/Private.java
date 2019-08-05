package com.example.myapplication.structural.flyweight;

public class Private implements Enemy {

    private String weapon;

    private final String LIFE;

    public Private(){
        LIFE = "200";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void lifePoints () {
        System.out.println("La vida de un soldado es: " + LIFE);
    }
}
