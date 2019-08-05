package com.example.myapplication.structural.bridge;

import android.util.Log;

public class SecureCreditCard implements ICreditCard {

    @Override
    public void realizarPago() {
        Log.d("TAG1", "Pago Realizado con Protocolo de Seguridad Máximo");
    }
}
