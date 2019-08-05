package com.example.myapplication.prototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;


/*
El patro prototipo tiene el objetivo de crear a partir de un modelo.
Especificar el tipo de objetos que se crearán mediante una instancia prototipica,
y crear nuevos objetos copiando dicho prototipo.
Si el coste de crear un objeto es muy grande y la creación utiliza recursos intensivos, lo
mejor que podemos hacer es clonarlo.
Para eso tenemos el patron prototype. Permite que un objeto cree una copia de si mismo
sin conoce su clase ni ningún detalle sobre como crearlos.

Prototype: Nos va a permitir declarar la interfaz del objeto a clonar.

Client: Es la clase encargada de solicitar al prototipo que realice la clonación necesaria
Prototype: Es una interfaz o clase abstracta la cual define la operación de clonado
que será utilizada para el proceso de clonación

ConcretePrototypeN: Impleneta la Prototype y hace uso del método clone que nos permite realizar el
clonado de la nueva clase deseada.
 */

/*
Creamos PrototypeCard
Amex y Visa
PrototypeFactory
 */
public class PrototypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);

        try{
            PrototypeFactory.loadCard();

            PrototypeCard visaPrototype = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
            visaPrototype.getCard();

            PrototypeCard amexPrototype = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
            visaPrototype.getCard();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

/*
Ventajas:
Clonar un objeto siempre es más rápido que crearlo.
Se puede utilizar cuando pensamos que crear objetos es complicado y costoso.
Si el coste de crear un objeto es muy grande y la creación utiliza recursos intensivos, lo
mejor que podemos hacer es clonarlo.
Nos oculta la complejidad de crear objetos.
Podemos agregar y eliminar cualquier objeto en tiempo de ejecución.
Ideal cuando necesitamos crear las instancias en tiempo de ejecución.

Desacoplamos la creación de objetos y evitamos repetir la instanciación con
parametros repetidos.

Como siemrpe la desventaja es el mayor código que hemos de escribir, pero se
ve amplicamente compensado con sus ventajas.


 */
