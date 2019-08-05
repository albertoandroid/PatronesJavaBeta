package com.example.myapplication.behavioral.mediator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class MediatorActivity extends AppCompatActivity {

    /*
    Patron de comportamiento
    El patrón de diseño mediator nos permite el desacoplamiento de los
    objetos introduciendo una capa intermedia para que la interacción entre
    los objetos ocurra a través de la capa.

    Si los objetos interactuan entre si directamente, los componentes
    del sistema estan estrechamente acomplados entre si lo que hace que el coste de mantenimienoti
    sea más alto.
    Pero si todos los objetos se comunicacon con un mediador y este quien
    realiza la comunicación con el resto es más facil de mantener.
    Imagina que tienes muchos objetos interactuando con otros otros objetos, esto
    conlleva una estructura compleja, como muchas conexiones entre diferentes objetos
    Con el patron mediator se encapsula el comportamiento de todo un comnjuneot
    de objetos en un solo objeto.

    Mediator: interfaz para comunicarse con los objetos.
    ConcreteMdiator: implementa la interfaz. Define como los objetos
    se comunicacna entre ellos. Además los conoce y mantiente.
    Colleague: define el comportamiento que debe implementar cada objeto para
    poder comunicarse con el Mediador de una manera standard.
    ConcreteCollegaue: Cada objeto conoce su mediator, y lo usa para comunicarse
    con otros colegas.

    El ejemplo tipico para aprender este patrón es desarrollar un chat
    imaginemos que tenemos dos usuarios y queremos que se comuniquen entre si.

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);

        ConcreteMdiator mdiator = new ConcreteMdiator();

        ConcreteCollege1 concreteCollege1 = new ConcreteCollege1(mdiator);
        ConcreteCollege2 concreteCollege2 = new ConcreteCollege2(mdiator);

        mdiator.setColleage1(concreteCollege1);
        mdiator.setColleage2(concreteCollege2);

        concreteCollege1.send("Hola como estas");
        concreteCollege2.send("hola 2");
    }

    /*
    Desacopla a los colegas, el patrón promueve bajar el acoplamiento entre colegas.
    Simplifica la comunciación entre objetos, cuando tenemos una comunicación de objetos
    muchos a muchos, por ser remplazada por uno a muchos que siempre es mucho más facil de
    manerajar.
    Un objeto no necesita conocer a todos los objetos con los que se va a comunicar,
    solo necesitar conocer el mediador.
    Como vemos es un sistema centralizado.
     */
}
