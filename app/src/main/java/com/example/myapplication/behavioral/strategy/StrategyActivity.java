package com.example.myapplication.behavioral.strategy;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class StrategyActivity extends AppCompatActivity {

    /*
    El patron de diseño estrategia nos permite elegir una implementación especifica de algoritmo o tarea
    en tiempo de ejecución de otras implementaciones para la misma tarea.

    Es decir que encapsula los algoritmos en clases, permitiendo de una manera sencilla que sean
    reutilizados. por ello en tiempo de ejecución es la aplicación la que decide que algoritmo utilizar.
    Por lo tanto en función de la tarea en la que estemos podemos elegir la implementación sin
    alterar el flujo de trabajo de la aplicación.

    Strategy: Es la interfaz común a todos los algoritmos.
    StrategyConcreto: Implemente un algoritmo utilizando la interfaz que hemos creado en strategy.
    Context: Tiene referencia a Straegy y según el contexto optará por una estrategia u otra.
    Context/Cliente -> Solicita un servicio a Strategy y este le devuelve el resutlado de un
    StrategyGontext.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        Context context = new Context(new CapitalStrategyTextFormatter());
        context.publishText("este texto sera converito a MAYUSCULAS a través del algoritmo");

        Context contextMinuscula = new Context(new LowerStrategyTestFormatter());
        contextMinuscula.publishText("ESTE texto SERA convertido a MINUSCULAS a través de un algoritmo");
    }


    /*
    Ventajas
    Una familia de algoritmos se puede definir como una jerarquia de clases y por ello se puede
    usar indistintamente para
    alterar el comportamiento de la aplicación sin que ello lleve el cambio de su arquitectura.
    Como los algoritmos son encasulados por separado, esto nos permite introducir de una manera muy sencilla
    nuevos algoritmos que cumplan con la misma interfaz.
    Como hemos comentado la aplicación puede cambiar de estrategia en tiempo de ejecución.
    Este patron nos permite escoger el algortimo requerido sin utilizar if else

    Desventaja
    La aplicación debe conocer todas las estrategias para seleccionar la correcta en cada situación.

    Las clases de contexto y estrategia normalmente se van a comunicar a través de una interfaz por la clase
    base de estrategia abstracta.
    Se puede dar el caso que la calse base tenga en su interfaz todos los comportamientos requeridos
    que algunas clases de estrategia
    concretas podrian no implementar.

     */
}
