package com.example.myapplication.structural.composite;

public class CuentaAhorro extends Component {

    private float accountBalance;

    private Saldo currentSaldo;

    public CuentaAhorro(float accountBalance){
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }

    @Override
    public Saldo getSaldo() {
        return currentSaldo;

    }

}
