package com.example.myapplication.behavioral.memento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

/*
El patrón Memento se usa para restaurar el estado de un objeto a un estado anterior.
Tambien se le conoce como el patron de instantanea, es decir Snapsho Patter.

Memento viene a ser un recuerdo que es como un punto de restauración durante el ciclo de vida del
objeto, que nuestra aplicación puede usar para restaurar el etado del objeto a su estado.
Tipicamente ha sido utilizado para videojuesgos para salvar el estado.

Es decir que el patrón memento nos permite capturar y exportar el estado interno de un objeto para
que luego se pueda resturar, sin romper la encapsulación.

Carataker: Es responsable de mantener a salvo a Memento.
Memento: Almacena el estado internto de un objeto Originator.
Originagtor: Crea un objeto Memento conteniendo una fotografia de su estado internto.

 */
public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);

        Carataker carataker = new Carataker();
        Article article = new Article(1,"Memento", "Memento es una pelicula");
        article.setText("Memento es una pelicula de Nolan");
        System.out.println(article.getText());

        //Hacemos memento en dicho estado
        carataker.addMemento(article.createMemento());

        article.setText("Memento es una pelicula de nola protagonizada por Guy Pearce");
        System.out.println(article.getText());

        //Hacemos memento en dicho estado
        carataker.addMemento(article.createMemento());



        ArticleMemento memento1 = carataker.getMemento(0);
        ArticleMemento memento2 = carataker.getMemento(1);


        article.restore(memento1);
        System.out.println(article.getText());

        article.restore(memento2);
        System.out.println(article.getText());


    }
}

/*
La mayor ventaja es que siempre podmeos descartar los cambios no deseados y restarurarlos
a un estado deseado o estable.

No compromete la encapsulación asociada con los objetos clave que participan en el modelo.

Nos ofrece alta cohesion

Proporciona una técnica de recuperación facil.

Desventaja: Un alto numero de mementos requiere más almacenamiento.
Tambien conlleva más tiempo de mantinimiento, puesto que hay que manejar las clases memento.
 */
