package com.example.myapplication.structural.adapter;

import android.util.Log;

public class GoldCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        //no hacer nada
    }

    @Override
    public void payWithSecureLevelZ() {
        Log.d("TAG1", "Tarjeta Gold - Pagando de Con Seguridad Baja");

    }
}
