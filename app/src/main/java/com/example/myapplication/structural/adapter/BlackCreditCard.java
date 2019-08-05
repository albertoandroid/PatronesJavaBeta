package com.example.myapplication.structural.adapter;

import android.util.Log;

public class BlackCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        Log.d("TAG1", "Tarjeta Black - Pagando de Con Seguridad Alta");
    }

    @Override
    public void payWithSecureLevelZ() {
        //No hacer nada
    }
}
