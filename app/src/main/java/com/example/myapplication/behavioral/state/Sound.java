package com.example.myapplication.behavioral.state;

import android.util.Log;

public class Sound implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        Log.d("TAG1", "Estado Sonando...");
    }
}
