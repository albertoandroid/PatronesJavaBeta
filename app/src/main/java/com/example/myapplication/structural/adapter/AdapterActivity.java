package com.example.myapplication.structural.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

/*
El objetivo del patron adapter es que dos interfaces incopatibles funcionen sin
problemas entre sí.

El patrón de diseño adaptador se utiliza con el objetivo de que dos interfaces no relacionadas
puedan trabajr juntas.

El objeto que une estas interaces se  llama Adaptador. y de hay viene su nombre

El adaptador nos permite convertir la interfaz de una clase en otra interfaz que esperan
los clientes.
Por lo tanto nos pemrite que clases trabajen juntas y que de otra manera no podrían hacerlo
debido a la incompatibilidad de sus interfaces.

Target -> Que define la interfaz especifica que usa el cliente.
Cliente: Ayuda a formar objetos para la interfaz Target.
Adaptado -> Define una interfaz que neceista adaptarse
Adapter -> Adapta la interfaz de adaptado a la interfaz target.
 */
public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");


    }
}
/*
La principal ventaja de este patrón es que permite trabajar a clases juntas, que de
otra manera no podrían hacerlos debido a que tienen interfaces incompatibles.

Es decir nos ofrece lograr reutilización y flexibilidad en el código, algo que siempre es muy recomendable.

La desventaja es que al final necesitamos muchas clases y además muchas veces se requieren
de muchas adaptaciones a lo largo de la cadena del adapter para obtener el tipo que necesitamos.

Al utilizar este patrón puede ser que el código cuando lo ve otra persona sea más dificil de entender.
 */