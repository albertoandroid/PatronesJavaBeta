package com.example.myapplication.singlenton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.myapplication.R;

/*
El patrón singlento es un patron de diseño creacional que nos permite que una aplicación pueda tener solo
y solo una instancia de cualquier clase, en todos los escenarios posibles sin ninguna condición
especial.

El patrón singlento nos permite que el mimso objeto sea siempre compartido en
distintas partes del código.

el objetivos de singleton es garantizar que una clase solo tiene una instancia
y proporcioa un punto de acceso global a ella.

Un uso muy común es en nuestro acceso a bases de datos o web service, donde podemos hacer solicitudes
desde cualqueir parte de la aplicación pero queremos utilizar simepre la misma instancia.
Vamos a crear una clase singleton Usuario, puesto que en nuestra aplicación solo vamos
a tener un usuario corriendo, así que puede ser un singleton..
 */
public class SinglentonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlenton);

        Card.getInstance().setCardNumber("1234-1234-1234-1234");
        Log.d("TAG1", Card.getInstance().getCardNumber());
    }
}

/*
Recuerda que el patrón singlento nos permite tener acceso controlado a la única
instancia que existe de la clase ya que se encuentra como hemos realizado encapsulada
dentro de la propia clase.
Por ejemplo posiblemente cuando te conectas con una base de datos o un web service
solo quieres tener una instancia de esa clase, en ese caso Singleton es tu opción.

Su principal desventaja es que es considerado como un antipatron debido a que es muy
dificil testear código cuando usamos sINGLETON, ya que guarda siempre la misma
referencia y por tanto durante los test no lo podemos cambiar a la configuración
que necesitemos para el test. Por ello hoy en día se suele usar la inyección de
dependencias para crear Singlenton.

 */
