package com.example.myapplication.structural.flyweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.Random;

public class FlyweightActivity extends AppCompatActivity {

    /*
    El patrón flyweiy nos permite a los desarrolladores el uso
    compartido de objetos para soportar grandes cantidades de objetos
    de grano fino de una manera eficiente en nuestro sistema.

    Un flyweight es un objeto compartido que se puede usar en múltiples
    contextos simultaneamente.

    El flywaight actua como un objeto independiente en cada contexto y de hay
    su ventaja.

    Al compatir estados para soportora un gran nuevmo de objetos pequeños
    aumentos la eficiencia de espacio en memoria. Algo que simepre
    es recomendable buscar.

    Este patrón es muy útil cuando necesitmaos muchos objetos similares
    que solo se diferencia en unos pocos parametos peor que el resto
    de parametos son comunes para todos.

    Además como hemos dicho nos permite controlar la memoria creando
    menos objetos y compartiendolos.

    Flyweight : Es una interaz a través de la cual los flyweighs pueden
    recibir y actuar sobre los estados no compartidos.

    ConcreteFlyweight: Implementa la interfaz flaywaith y almacena los
    estados que se comporatnten en el caso de que los haya.

    UnsharedConcreteFlyweith : No todas las subclases de Flyweit serán
    compartidas, por ella tenemos esta no comportatida fliyweit class.

    Flayweith factory: Será nuestro factory, es decir para crear y
    gestionar los objetos flywieht.
    Es el encargado cuando el cliente solicita un flywete de crearlo o
    prporcionar una instancia si ya fue creado con anterioridad
     */

    // para crear enemigos de manera random utilizamos estos arrays
    private static String[] enemyType =
            {"Private", "Detective"};
    private static String[] weapon =
            {"Fusil", "Revolver", "Pistola", "Metralleta", "Lanza Granadas", "9mm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);

        //Vamos a crear 15 enemigos
        for(int i=0; i<15; i++){
            Enemy enemigo = EnemyFactory.getEnemigo(getRandomEnemyType());
            enemigo.setWeapon(getRandomWeapon());

            enemigo.lifePoints();
        }
    }

    public static String getRandomEnemyType(){
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    public static String getRandomWeapon(){
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapon.length);

        // Return the weapon stored at index 'randInt'
        return weapon[randInt];
    }


    /*
    La principal ventaja de este patrón es que reduce mucho la cantidad
    de memoria que necesitamos y eso siempre es algo recomendable a la hora de
    desarrollar cualquier tipo de aplicación.

    Reduce el numero total de objetos que tenemos en el sistema.

    Nos proporciona un mecanismos centralizado para controlar los estados
    de muchos objetos virtuales.

    Es un patrón complicado, puesto que pueden aparecer errores, sino lo hemos
    aplicado correctamente que sean de dificil depuración.


     */
}
