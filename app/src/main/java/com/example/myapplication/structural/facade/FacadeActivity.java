package com.example.myapplication.structural.facade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class FacadeActivity extends AppCompatActivity {

    /*
    El patrón estructural facade busca simplicar el sistema para el cliente
    proporcinando una intefaz unificada para un conjunto de subsistemas. Por
    lo tanto define una interfal de alto nivel.
    Por lo tanto es un sistema facil de usar como veremos en código.

    Como hemos dicho, el objetio de este patrón es que cuando tenemos un
    sistema complejo y quermeos exponer a los clientes su uso de manera
    simplificada esta será la opción a utilizar.
    Es decir, que su objetivo final es ocultar la complejidad interna
    a tráves de una única interfaz que parece simple de utilizar
    desde el exterior.

    Facade: Básicamente se encarga de conocer que clases del subsistema
    son responsables de una petición.

    Subsistema: Su objetivo es manejar el trabajo asigando por Facade.
    No tiene referencia al objeto facade.

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        CreditMaker creditMaker = new CreditMaker();
        creditMaker.showCreditBlack();
        creditMaker.showCreditSilver();
        creditMaker.showCreditSilver();
    }


    /*
    La principal ventaja del patrón facade no está relacionada con la
    complejidad del codigo, sino que oculta esa dificultad al cliente.
    Por lo tanto son los clientes quien se benefician de patrón facade
    ya que les hace una facil implementación.

    Al ofrecer una interfaz simple para el cliente en lugar de
    subsistemas compejos ofreces al cliente una cantidad reducida
    de objetos con los que lidiar.

    Basicamente ocultamos al cliente la complejidad del susistema para que
    lo usse facilmente.

    Puede ser dificil de implemenatr.
     */
}
