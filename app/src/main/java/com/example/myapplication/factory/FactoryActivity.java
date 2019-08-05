package com.example.myapplication.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

/*
Patron creacional
El objeto del Factory Method es librarnos a los desarrolladores de la creación de objetos de la forma correcta.
Es decir que define la interfaz de creación de un tipo de objeto, y permite a las subsclases del mimso
decidir que tipo de instancia concreta necesitan.
Es decir que este patrón se usa para solucionar el problema que nos encontramos cuando tenemos que
crear la instancia de un objeto que a priori no sabemos aún que tipo de objeto ha de ser. Es decir
en una aplicaicón real podría ser debido a que el usuario en la aplicación seleccione una opción u otra

porque depende de la configuración que se hace en tiempo de despliegue de la aplicación.

Product: Define la interefaz de los objetos que se van a crear.
ConcreteProduct: Implementación de la interfaz.
Creator: Es donde se declara el método de fabricación (Factory Method) que devuelve un objeto
de tipo Producto.
ConcreteCreator: Sobreescibe el método de la factoría para devolvernos una
instancia concreta de un objeto ConcreteProducto.

1.- Creamos Producto payment
2.- ConcreteProducto
3.- Concrete Creator y Creator

 */
public class FactoryActivity extends AppCompatActivity {

    private Payment payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        /*
        Digamos que aunque aqui ponemos el tipo de pago directamente, pero aqui
        seria dejar seleccionar al usuario que quiere pagar con googlepay
         */
        PaymentFactory.TypePayment typePayment = PaymentFactory.TypePayment.GOOGLEPAY;
        payment = PaymentFactory.buildPayment(typePayment);


        payment.doPayment();
    }
}

/*
Ventajas: Si mañana queremos crear por ejemplo un nuevo metodo de pago, solo tenemos que
crear un nuevo ConcretProduct y añadirlo como opción al ConcreteCreator sin que el proceso de
compra en nuestra factoryactivity se viera alterado.
Es decir nos ofrece más flexibilidad crear un objeto con un Factory Method que directamente.
2.- Nos elemina la necesidad de introducir clases especificas en el modulo del creator. Solo manjeamos la
interfaz product en nuestro caso Payment y nos pemrite añadir cualquier clase concretproducto
que queramos.

 */
