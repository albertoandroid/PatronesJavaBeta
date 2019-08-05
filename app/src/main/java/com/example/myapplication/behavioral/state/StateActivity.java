package com.example.myapplication.behavioral.state;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class StateActivity extends AppCompatActivity {

    /*
    El objeto del patron status es que un objeto modifique su comportamiento cada
    vez que cambia su estado interno.

    Es decir que según su estador interno se comportará de una manera u otra.

    La manera de hacer esto sin patrón status,  es decir que un objeto tenga
    diferentes comportamientos según el estado en el esta, se puede hacer con
    una cantidad ingente de if-else, codigo que al final resulta imposible de mantaner.
    Asi que este patrón nos va a descoplar este codigo.

    Context-> Mantinee una instancia del estado actual.
    State: Define la interfaz para el comportamientoe asociado a un determinado
    estado del Contexto.
    StateConcrete-> cada subsclase implemente el comportamientoe asociado con un estado
    del contexto.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.alert();
        context.setState(new Silent());
    }

    /*
    Este patrón nos permite agregar facilmente nuevos estados y nuevos comportamientos en nuestra aplicacion
    sin que esto afecte a otros componenente.s

    Una de las ventajas de este patrón es que nos ayuda a reducir el uso de sentencias if-else, es decir de
    logica condicional.

    Se incremente el numero de subclases

     */
}
