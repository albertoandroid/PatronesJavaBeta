package com.example.myapplication.structural.composite;

public class CuentaComposite extends Component {
    private float totalBalance;
    private Saldo compositeSaldo, individualSaldo;

    public float getBalance() {
        totalBalance = 0;
        for (Component f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public Saldo getSaldo() {
        for (Component f : list) {
            individualSaldo = f.getSaldo();
            compositeSaldo.saltoTotal(individualSaldo);
        }
        return compositeSaldo;
    }
}
