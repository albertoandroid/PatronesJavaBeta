package com.example.myapplication.behavioral.visitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
/*
El patron visitor nos permite separar un algorimo de la estrucurtra del objeto en la
que opera.
Al separar nos ofrece la capacidad de agragar nuevas operaciones a la estructura del objeto sin
modificar dicha estrucutra.

Usamos una clase visitor que cambia el algorimto de ejecución de una clase elmento. De esta
manera el algoritmo de ejecución del elmente puede variar cuando el
visitor varia.

Visitor -> Es una interfaz que vamos a utilizar para declarar las operaciones
de visita para todos los tipos de clases visitables.

ConcreteVisitor -> para cada tipo de visistante debemos implementar todos
los metodos de visita declarados en la Interfaz Visitor.
Cada visitante es el repsonsable de las diferentes operaciones.

Visitable o Element: Es la interfaz que declara la operación de aceptación.
Es decir es el punto de entrada que permite a un objeto ser "visitado" por el
objeto Visitor.

ConcreteVisisitable o Concrete Visitable-> Esta clase implmeneta la interfaz Visitable y definene la operación
de aceptación.

1.- CreditCardVisitor
2.- OfertaVisitable
3.-
 */
public class VisitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);

        OfertaVisitable ofertaVisitable = new OfertaGasolina();
        ofertaVisitable.accept(new BlackCreditCardVisitor());

    }
}
/*
Este patrón nos facilita agragar nuevas operaciones a la jerarquia de visitants sin
contaminar muhco el diseño existente.

Agregar un nuevo element a nuestro sistema es bastante sencillo, puesto que solo requiere un cambio
en la interfaz e implementarlo en el visitante pero las clases de elementos existentes no se veran
afectadas.

Si tenemos demasiadas implementaciones de la interfaz visitante, posiblemente sea bastante costoso
su extión.
 */
