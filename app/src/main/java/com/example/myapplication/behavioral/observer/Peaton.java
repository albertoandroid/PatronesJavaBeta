package com.example.myapplication.behavioral.observer;

import android.util.Log;

public class Peaton implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.semaforoStatus.equals("ROJO_COCHE")){
            Log.d("TAG", "Semaforo Peator en Color: VERDE-> Peaton puedes pasar");
        }else{
            Log.d("TAG", "Semaforo Peator en Color: ROJO -> Peaton NO puedes pasar");
        }
    }
}
