package com.example.myapplication.behavioral.templatemethod;

import android.util.Log;

public class Paypal extends Payment {
    @Override
    void initialize() {
        Log.d("TAG1", "Inicializando el Pago con Paypal");

    }

    @Override
    void startPayment() {
        Log.d("TAG1", "Realizando el Pago a través de los servidores de Paypal");

    }

    @Override
    void endPayment() {
        Log.d("TAG1", "Finalizado el Pago a través de los servidores de Paypal");

    }
}
