package com.example.myapplication.behavioral.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
/*
El patrón Observer nos permite implementar una estrategia que reacciona a los cambios de estado
en el objeto observado.
Es decir que nos permite monitorear el estado de un objeto de un programada.
Hoy en día este patrón es muy utilizado sobre todo en programación reactiva como es RxJava y RxAndroi que
tengo un curso en Udemy, pero veamos sus fundamentos.
Este patrón se utiliza para su utilización como un sitema de detención de eventos en
tiempo de ejecución.

Lo que buscamos es notificar a otros objetos cuando cambia su estado.
Cuando hay una relación de dependencia de uno a muchos que requiere que un objeto notifique a multiples
objetos que ha cambiado su estado esta es la mejor opción.

Subject-> Interfaz que define las operaciones para adjuntar y anular la vinculación de los
observadores al Subject.
ConcreteSubject -> Clase concrtea de Subject. Mantiente el estado del objeto y cuando
se producte un cambio de en el estado, notifica a los observadores adjuntos.
Observador-> Interfaz que define las oepraciones que se utilizarán para notificar al subject.
ConcreteObserver-> Implementaciones concretas de los observadores
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Coche coche = new Coche();
        Peaton peaton = new Peaton();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);

        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));

    }
}


/*
Ventajas_> Permite modificar las clases Subjects y los observer independientemente.
Podmeos añadir nuevos observadores en tiempo de ejecución sin problemas.
Dos capas de diferentes niveles de astracción se pueden comunicar
entre sin sin ningun tipo de probelma.

Permite lo que se conoce como notificación Boradcast, es decir un objeto
subject envia su notificación a todos los que los estan oberservando sin
enviarlo a alguno en concreto.
Asi que todeos los observer los recibien y deciden
si hacer caso o no al mensaje.

Su implementación al principio resulta complicada
 */