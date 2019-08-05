package com.example.myapplication.behavioral.iteractor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.myapplication.R;

import java.util.Iterator;

public class IteratorActivity extends AppCompatActivity {

    /*
    El patron iterador nos ofrece un mecanismo estandar, es apliamete conocido por la comuidad
    de programadores para poder acceder de manera secuencial a los elementos de una colección.

    El patron iteractor es uno de los de mayor uso. Hay muchas estructuras de datos
    por ejemplo las colecciones de datos utilizan este patron.
    Cada colección de datos debe proporcionar un iterador que le permite recorrer sus obejtos.
    Sin enbargo, al hacerlo, debe asegurarse de que no exponga su implementación.
    Iteractor se usa en List, Map, Set

    Una colección de datos solo es útil cuando proporcina una manera de accedder a sus elementos
    sin exponer su estructura interna. Los iteradores asumen esta responsabilidad

    El patrón iterador nos permite diseñar un iterador de una colección de datos de tal manera
    que:

    Podamos acceder a los elementos de una colección sin exponer la exturcutura interna de los
    elementos o la colección en si.
    Iterador nos permite multiples recorridos simultanesos de una colección de principio a fin
    hacia atrás o ambas direccións.

    Agregate -> Interfaz para crear un interador
    Iterator -> Interfaz para acceder y recorrer los elementos de un agrado
    ConcreteItearactor -> Implementa la interaz del iterator y guarda la posición acutal del
    recorrido en cada momento
    AgregadoConcreto-> Implementa la interfaz de creación de iteradores devol videndo una
    instancia del iterador conreto apropiado.
    Cliente-> solicita recorrer la colección y lo hace siguiendo los métodos que nos ofrece
    la interfaz iterator.

    1. Clas Card
    2. Collection
    3. CardCollection
    4. Iterator
    5. CardIteractor

     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);

        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("AMEX");
        cards[2] = new Card("MASTER CARD");
        cards[3] = new Card("APPLE CARD");
        cards[4] = new Card("GOOGLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()){
            Card tarjeta = (Card)iterator.next();
            Log.d("TAG1", tarjeta.getType());

        }


    }

    /*
    Ventajas de Iteractor_ Pudes acceder a una colección de objetos sin conocer el código
    de los objtos.
    Utilizar varios objetos iteractor es bastante simple de implementar y por lo tanto
    podemos manear varios recorridos al mismo tiempo.
    Las clases Iteractor nos simplifican el codigo de las colecciones, ya que el código
    que hace los recorridos estan en los iteractores y no en la coleccion
     */
}
