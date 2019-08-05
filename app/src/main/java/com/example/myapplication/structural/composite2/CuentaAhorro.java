package com.example.myapplication.structural.composite2;

public class CuentaAhorro implements CuentaComponent {
    private Double amount;
    private String name;

    public CuentaAhorro(Double amount, String name){
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName()Cu {
        System.out.println("Cuenta Ahorro: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
