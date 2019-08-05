package com.example.myapplication.structural.bridge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

/*
El patron Brige se utiliza cuando tenemos que desacoplar una abstracción de su implementación
para que los dos puedan variar independientemente.

Este patrón implica una interfaz que actua como puente que hace
que la funcionalidad de las clases concretas sea independiente de las clases del implementador de la
interfaz. Por lo tanto ambos tipos de clases se pueden alterar estructuralmente
sin afectarse entre si.

Abtractcion -> Define una interfaz abstrafta. Mantiene referencia a objeto Implementor.
RefinedAbstraction: Extiende la intefaz definida por Abstraction
Implmentor: Define la interface para la implmentación de la clase.
ImplementadorConcretor: Implmenta la intefface de Implmentor.

 */
public class BrigeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brige);

        CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();

        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();


    }
}

/*
La ventaja radica que en los cambios en la implemtnación de una abstacción no afectan al cliente
Evitamos enlaces entre una astracción y una implementaciópn.

2.Mejora la extensibilidad: se puede extender las jerarquías de Abstraction e Implementor independientemente.
3.Esconde los detalles de la implementación a los clientes.
 */
