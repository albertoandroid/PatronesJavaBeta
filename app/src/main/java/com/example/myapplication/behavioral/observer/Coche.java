package com.example.myapplication.behavioral.observer;

import android.util.Log;

public class Coche implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.semaforoStatus.equals("ROJO_COCHE")){
            Log.d("TAG", "Semaforo Peaton en Color: ROJO -> Coche SI puedes pasar");
        }else{
            Log.d("TAG", "Semaforo Peator en Color: VERDE -> Coche NO puedes pasar");
        }
    }
}