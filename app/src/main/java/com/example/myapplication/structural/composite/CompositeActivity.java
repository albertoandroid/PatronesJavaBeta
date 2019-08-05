package com.example.myapplication.structural.composite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class CompositeActivity extends AppCompatActivity {

    /*
    El patrón composite es utilizado para construi objetos o algoritmos complejos a partir
    de objetos o algoritmos más simples y que son parecidos entre si, todo esto gracias
     a la composición recursiva y a una estructura en forma de árbol.

     Otra forma de decirlo es que El patrón composite nos permite consturir objetos complejos
     componiendo de forma
     recursiva objetos similares en una estrutura de arbol.
     Como todos los objetos o algoritmos tienes una interfaz común nos simplica el tratamiento
     puesto que los podemos tratar a todos de la misma manera.

     Component -> Declara la interfaz para los objetos en la composiciòn
     Implementa el comportamiento predeterminado para la interfaz común.
     Delara una interfaz para acceder y gestionar sus componenetes secundarios

     Leaf -> Representa objetos leaf en la composición. Un leaf no tiente hijos.
     Composite -> Define el comportamiento de los componentes que tienen los hijos.
     Almacena los componetes hijos.

    Cliente-> Manipula objeos en la compoosicón a través de la interfaz de componentes.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composite);


        // Creating a component tree
        Component component = new CuentaComposite();

        // Adding all accounts of a customer to component
        component.add(new CuentaAhorro(100));
        component.add(new CuentaCorriente(150));

        // getting composite balance for the customer
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);

        Saldo saldoTotal = component.getSaldo();
        System.out.println("Merged Statement : " + saldoTotal);
    }
}
     /*
     Los clientes tratan los objetos primitivos y compuestos de una manera uniforme
     a través de una interfaz de componentes que simplifica el código al cliente.

     Agregar nuevos compoentes siempre es sencillo y no es necesario cambiar el código
     al cliente ya que como hemos indicado el cliente trata los nuevos componentes
     a través de la interfaz componente.


     Al final utilizar este patrón nos puede llevar a la creación de muchos pequeños objetos en código
     que estarán encadenados, y por lo tanto dificil de depurar.

     Resulta más complicado de manejar este patrón que solo utilizar la herencia.
      */
