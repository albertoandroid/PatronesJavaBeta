package com.example.myapplication.behavioral.templatemethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
/*
El patrón Template Method define los pasos secuenciales para ejecutar un algortmo de varios pasos.
Es decir que define la estructura del algoritmo y su lógica será implementada en las subclases.
Por ello se llama template, es decir plantilla.

AbstractTemplate o AbstracClass: Es una clase abstracta que definei el esqueleto del algoritmo y
tenemos los metodos abstractos que se deberán implementar en las subsclaes concretas

ConcretClass: Impementa los metosos abstractos de la Clase Abstracta y nos permite realizar los pasos
del algoritmo que son especificos de cada subsclase.
 */
public class TemplateMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method);

        Payment payment = new Visa();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    }
}

/*
Las principal ventaja de este patrón es que nos ahorra duplicar codigo. Se mueve
toda la parte común de la implementación y los pasos a la clase abstracta.
Es decir nos permite reutilizar codigo de una manera sencilla.

Como vemos es un patrón que tiene una implementación bastante sencilla y da gran utilidad.
Por lo tanto podemos aplicar ciertos pasos de algortimos secuenciales en el paradigma de la programación.

Como siempre la desventaja, son el numero de clases adicionales que hay que crear.
 */
