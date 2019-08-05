package com.example.myapplication.behavioral.chainofresponsibility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class ChainOfResponsibilityActivity extends AppCompatActivity {

    /*
    Chain Of Responsabilitity o Cadena de responsabilidad es un patron
    de comportamiento que nos evita acoplar el emisor de una petición a su
    receptor dando a más de un objeto la posibilidad de responder
    a una petición.

    Es decir este patrón pemite que varias clases intente manejar uina solicitud,
    independienbtemente de cualquier otro objeto a lo largo de la cadena.
    Una vez que se ha manejado la solicitud, completa el ciclo de la cadena.

    Su uso es ideal cuando las peticiones emitidas por un objeto deben ser atendidas por
    distintos objetos receptores.
    y no sabemos a priori que objeto puede resolver el problema

    El objetivo de este patrón es crear un sitema que pueda servir a diversas
    solicitudes de manera jerarquica. Es decir, si un objeto que es parte de un
    sistema no sabe como responde a una solicitud, la pasa a lo largo del arbol de objetos.

    Handler: es la interfaza para manejar las peticiones.
    HandlerConcreto: Si
    puede manejar la petición lo hace, sino puede la reeeniva a su sucesor.
    Cliente: Inicia la petición. Conoce a un gestor que es el que lanaza la petición a la cadena
    hasta que alguien la procesa.

    1.- Interfaz ApproveLoanChain
     */

    /*
    En el siguiente ejmplo vamos a ver como gestionar una tarjeta de credito,
    por lo tanto dependiendo de la cantidad de dinero que queremos a credito
    la petición será gestionada por una clase u otra.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility);

        Bank bank = new Bank();
        bank.creditCardRequest(1000);
    }

    /*
    Las ventajas es que nos reduce el grado de acomplamiento.
    El Objeto no necesita conocer la estructura de la cadena.
    Se puede cambiar los miembores dentro de la cadena o cambiar su orden
    y además pemirte agregar o elminar responsables de la cadena de una forma
    rapida.
    Añade flexibilidad para asignar responsabilidades a objetos

    Desventajas
    No se garantiza la recepción de la solicitud. Es un patrón que cuesta debugear.
     */
}
