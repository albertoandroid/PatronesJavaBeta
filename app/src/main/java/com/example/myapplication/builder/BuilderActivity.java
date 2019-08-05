package com.example.myapplication.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.myapplication.R;



/*
Patron creaiconal builder
El patrón builder nos va a permitir crear objetos complejos a partir de un objeto fuente.
El objeto fuente se denomina producto y nos permite centralizar el proceso de creación en
un único punto.
Es decir que tenemos un único procemiento de creación de objetos complejos, de modo
que el mismo procedimiento nos permite crear representaciones distintas.

1.- ¿Cuando utilizar el Patrón?
Cuando nuestro sistema necesita de objetos complejos(compuestos por muchos atributos)
pero el número de configuraciones será limitado.
El algoritmo de creación de dicho objeto complejo se puede indepencizar de las partes
que lo componen y del ensamblado de las mismas.

Director: Se encarga de construir un objeto utilizando el Constructor (Builder).

Builder: Interfaz abstracta que permite la creación de objetos.

Concrete Builder: Implementación concreta del Builder definida para cada uno de los tipos.
Permite crear el objeto concreto.

Product: Objeto complejo a Construir.

1.- Creamos Card
2.- Creamos CardBuilder
3.- Visa y AmexBuilder
4.- Director

 */
public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        CardDirector director = new CardDirector();
        director.setCardBuilder(new VisaBuilder());
        director.constructCard();
        Card visaCard = director.getCard();

        Log.d("TAG1", visaCard.getMaterial() + " " + visaCard.getNumber());
    }
}
/*
Ventajas Patrón Builder
1.- Reduce el acoplamiento. Recuerda que un bajo acomplamiento entre las unidades de software es el
estado ideal
que hemos de buscar a la hora de hacer una buena programación o un buen diseño.
Cuanbdo menos dependiente sean las partes que constityen un sistema información , mejor resultado.
Recuerda que el desacoplamiento total es imposible, pero si lo podemos reducir como hemos visto
con este patron.
2.- Nos permite crear estructuras complejas, respetando la interaz común de la clase Builder.
3. El código de construcción es independiente del de representación.
Las clases concretas que tratan las representaciones interenas no forma parte de la interfaz builder.
4.- Nos da mayor control en el proceso de creación del objeto.
Como hemos visto el director, controla la creación, solo cuando el builder ha terminado de construir
el objeto lo recupera el director.

Negativa.
Introduce complejidad en los programas.

 */