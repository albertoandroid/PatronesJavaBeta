package com.example.myapplication.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    Saldo saldo;

    protected List<Component> list = new ArrayList<>();

    public abstract float getBalance();

    public abstract Saldo getSaldo();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public Component getChild(int i) {
        return (Component) list.get(i);
    }
}
