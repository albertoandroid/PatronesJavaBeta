package com.example.myapplication.structural.bridge;

import android.util.Log;

public class UnsecureCreditCard implements ICreditCard {

    @Override
    public void realizarPago() {
        Log.d("TAG1", "Pago Realizado Sin Seguridad");
    }
}
