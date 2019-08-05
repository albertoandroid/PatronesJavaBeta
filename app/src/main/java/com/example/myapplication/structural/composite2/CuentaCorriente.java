package com.example.myapplication.structural.composite2;

public class CuentaCorriente implements CuentaComponent {

    private Double amount;
    private String name;

    public CuentaCorriente(Double amount, String name){
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cuenta Corriente");
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
