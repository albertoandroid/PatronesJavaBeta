package com.example.myapplication.structural.decorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class DecoratorActivity extends AppCompatActivity {

    /*
    El patron estructural decorator se utiliza habitualmente para agregar
    caractereisticas o comportamientos adicionales a una instacia particular
    de una clase, sin llegar a modificar las otras instancias de la misma clase.


    Básicamente este patrón decorator se utliza para proporcionar una alternativa
    flexible a la subclasificación para tener más funcionalidad.

    Básicamente lo que tenemos que entender es que este patrón, implica que
    decorar un objeto cambia su comportamiento pero no su interfaz.

    Es decir el patrón decorator nos va a permitir añadir más responsabilidades
    a objetos concretos de formá dinamica. Por supuesto es una alternativa a la
    herencia para extener las funcionalidades.
    Este patrón es conocido tambien como Wraper es decir un enbolvotorio de la clase.

    Por ejemplo si quieres añadir solo más resposabilidades a un objeto de la clase
    pero no a toda la clase esta es la opción perfecta.

    Component: Que es el contenedor o embolotorio que puede tener responsabilidades
    adicionales asociadas con el en tiempo de ejecución.

    Concrete Component: Es el objeto original al que se le han añadido las
    reponsabilidades adicionales en nuestro programa

    Decorator: Clase abstracta que contine una referencia al objeto component y
    tambien implemnbta la interfaz del componente.

    Decorator Cocreto: Extiendo el decorador y crea una funcionalidad adicional
    sobre la clase componente.


     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);

        Credit gold = new Gold();

        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);

        Credit goldSecureInternationaPayment = new Gold();
        goldSecureInternationaPayment = new InternationalPaymentDecorator(goldSecureInternationaPayment);
        goldSecureInternationaPayment = new SecureDecorator(gold);
        gold = new InternationalPaymentDecorator(gold);

        System.out.println("----Tarjeta Gold configurada------");
        gold.showCredit();

        System.out.println("----Tarjeta Black configurada------");
        blackInternationalPayment.showCredit();


        System.out.println("----Tarjeta Gold configurada------");
        goldSecureInternationaPayment.showCredit();
        /*
        Credit blackInternationalPayment = new CreditDecorator(new InternationalPaymentDecorator(new Black()));

        Credit goldSecure = new CreditDecorator(new SecureDecorator(new Gold()));

        gold.showCredit();
        blackInternationalPayment.showCredit();
        goldSecure.showCredit();
        */
    }


    /*
    La principal ventaja de este patrón es que nos da más sencillez en vez
    de utilizar la herencia.
    Es decir que podmos utilizar diferentes conbinaciones de distintos tipos
    decorator y podemos crear muchas combinaciondes de comportamientos distintos.
    Si utilizaramos la herencia para hacer eso, sería más complicado.

    Al final si solo deseamos agregar, mejorar o incluso se puede eliminar
    el comportamiento de un objeto este esta ha de ser nuestra solución a hacer.



    La desventaja de este patrón, es que nos obliga a crear muchos objetos
    encadenados, lo que siempre hay que mantener y depurar y por lo tanto
    es una descventaja.
     */
}
