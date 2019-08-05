package com.example.myapplication;

/*
https://github.com/eugenp/tutorials/blob/master/patterns/design-patterns/src/main/java/com/baeldung/creational/abstractfactory/AbstractPatternDriver.java
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.myapplication.prototype.PrototypeFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            String visaPrototipe = PrototypeFactory.getInstance(VISA).toString();
            Log.d("TAG1", visaPrototipe);
        }catch (Exception e){

        }
    }
}

/*
El programa pude dinamicamente añadir y borrar objetos prototipo en tiempo de ejecucción.
Esta es una ventaja que nos ofrece ningún otro patrón de creación.
En el ejemplo de arriba, hemos creado una aplicación que requiere el tipo de tarjeta a la hora
de rearlizar un pago, pero no quiero crear sus instancias en todo momento ya que es costoso.
Entoces crear sus instacias de protoitpo y cada vez que neceiste una nueva isntancias simplemente
clono el prototipo.
Clonar un objeto es más rapido que crearlo.
Se desacopla la creación de las clases y se evita repetir la instancias de objetos
con parametros repetitivos.
 */
