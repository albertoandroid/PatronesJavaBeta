package com.example.myapplication.behavioral.command;

import android.util.Log;

public class CreditCard {

    /*
    Esta clase desde el punto de vista del patrón comman es un receiver.
     */

    public void sendPinNumberToCustomer(){
        Log.d("TAG1", "El Pin number ha sido enviado al Cliente");
    }

    public void sendSMSToCustomerActivate(){
        Log.d("TAG1", "Enviado SMS al cliente informando que su Tarjeta ha sido activad, que se ponga en contacto si no la ha recibido");
    }

    public void activate(){
        Log.d("TAG1", "La tarjeta ha sido activada");
    }

    public void desactivate(){
        Log.d("TAG1", "La tarjeta ha sido activada");
    }

    public void sendSMSToCustomerDesactivate(){
        Log.d("TAG1", "Enviado SMS al cliente informando que su Tarjeta ha sido desactivada");
    }
}
