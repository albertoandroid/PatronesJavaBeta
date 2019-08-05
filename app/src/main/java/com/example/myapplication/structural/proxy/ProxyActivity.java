package com.example.myapplication.structural.proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class ProxyActivity extends AppCompatActivity {

    /*
    El patrón estructural proxy como su propio nombre indica, se utiliza
    como intermedio para acceder a un objeto, es decir un proxy y esto
    nos permite controlar el accedo a dicho objeto.
    Por lo tanto las llamadas al objeto acaban ourriendo indirectamente
    a través del objeto proxy, que es el que actua como sustituto del
    objeto original, delegando luego las llamdas a los metodos de los objetos
    respectivos.

    El patrón proxy se divide en 4 Grupos:
    Proxy remoto: Representa un ojeto que esta remoto.
    Para poder hablar con objetos remotos el cliente debe realizar
    un trabajo adicional en la comunicación a través de la red. Por lo tanto
    será el objeto proxy el que realiza esta comunicación en nombre
    del objeto original y el cliente se centra en la conversación real que
    hay que hacer.

    Proxy virtual: Crea objetos costosos por encargo. Por ejemplo cuando
    cargamos un programa en nuestro ordenador no siempre se cargan todas
    las opciones por defecto. Lo que se hace es que solo se habilitan los
    modulos cuando el usuario los va a utilizar.

    Proxy de Protección: Básicamente se encarga de controlar el
    acceso a un objeto. Por tanto ofrece seguridad.

    Smart Proxy: Suele encargarse de hacer tareas de limpieza adicionalses
    cuando un cliente accede a un objeto. Por ejemplo bloquear un objeto
    para impedir acceso concurrente a el.


    Proxy viene a significar "en lugar de" Es decir que controla y administra
    el accedo al objeto que esta protegiendo.

    Subject: Es una interfaz que expone la funcionalidad disponsible para
    ser utiliza por los clientes.

    RealSubject: Es una clase que implemente Subject y es una implementación
    concreta que debe ocultarse detrás de un proxy.

    Proxy: Oculta el objeto real extendiendolo y los clientes se comunican con el
    objeto real a través de este objeto proxy.



     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);


        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("udemy.com");
            internet.connectTo("facebook.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /*
    Como hemos podido ver una de las ventajas a la utilizar el patrón
    proxy es que nos ofrece mucha más seguridad.

    Con este patrón evitamos la duplicación de objetos que podrian
    ocupar gran tamaño en memoria. Por lo tanto mejoramos el rendimiento en
    nuestra app.

    Al utilizar este patrón estamos introducción a nuestro codigo
    otra capa de abstracción que en muchas ocasinos nos puede generar problemos si
    algunos clientes acceden diractamente a RealSubject y además tambien
    acceden a las clases proxys . Por lo tanto deberemos analizarlo.


     */
}
