package com.example.myapplication.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

/*
El patrón factorya abstracta es otro patrón creacional. Y por tanto su objetivo es ayudar a crear objetos
El patron abstract factory es en resumidas cuentas una superfabrica, o una fabrica de fabricas del
patron factory que vimos en el capitulo anterior.
Es decir primero tenemos que indicar que fabrica va a producir el objeto y luego ya tenemos
la isntacia deseada.
El patrón abstract factory nos permite crear mediante una interfaz familias de objetos
denominados productos que dependen mutuamente y además todo esto sin especificar cual es el objeto concreto.
Es similar al factory method, solo que en este caso esta orientado a combinar producto.

Cuando utilizarlo:
Cuando un sitema debe ser independiente de como sus objetos son creados.

Nuestro sistema debe ser configurado con una cierta familia de productos
Hay que reforzar la noción de dependencia mutua entre ciertos objetos.

AbstractFactory: Interfaz para la creación de objetos de productos abstractos.
ConcreteFactory: Implementa la interfaz para la creación de obetjos de productos concretos.
AbstractProducto: Interfaz para los objtos de un tipo de productos
ConcreteProduct: Define un objeto de producto que la correspondiente factoria
conreta se encarga de crear a la vez que implementa la interfa de producto abstractor.
Client: UItiliza solamente las interfaces declarasdas en la factory y en los producots
abstractos.

 */

/*
Creamos la Primera Fabrica
1.- Payment abstracClass
2.- Creamos CardPayment y Google
Creamos la segunda fabrica
3.- Method
4.- Creamos MonthlyPayment y CashPayme
5.- Creamos la Fabrica Abstractra
//Creamos Factory concretos
6.- PaymentInAdvaceCardFactory
7.- MontlyGoogleFactory
//Odenamos todo con un gestor
8.- PaymentMethodManager
 */
public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

        AbstractFactory factory1 = new PaymentInAdvaceCardFactory();
        PaymentMethodManager alMomentoTarjeta = new PaymentMethodManager(factory1);

        AbstractFactory factory2 = new MontlyGoogleFactory();
        PaymentMethodManager mensualGoogle = new PaymentMethodManager(factory2);


    }
}

/*
Ventajas: Ocultamos a los clientes las clases de implementación. Los clientes
pueden manipular los objetos a través de las intefaces o clases abstractas.
Es decir aisla el código del cliente de las clases concretas.

Facilita el intercambio de familias de objetos tal y como hemos visto.

Promueve la consistencia entre los objetos.

Como siempre este patrón creacional es perfecto, cuando el sitema debe
ser independiente de como se crea, se compone y se respresenta el objeto.

Desventaja: Para crear nuevos productos se deben modificar tanto la fabrica abstracta
como las concretas.
 */
