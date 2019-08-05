package com.example.myapplication.structural.flyweight;

import java.util.HashMap;

/*
Clase que usamos para obtner un enemigo usando HshMap.
Que nos devuelve un enemigo si un enemigo de ese tipo ya existe.
Sino existe lo crea.
 */
public class EnemyFactory {

    /*
    El hashmap almacena la referencia de los objetos enemgios.
    Es decir tanto de soldado como de teniente.
     */
    private static HashMap<String, Enemy> enemigos =
            new HashMap<>();

    //Metofo para obtener enemigo
    public static Enemy getEnemigo(String type){
        Enemy enemigo = null;
        //Si el enemigo ya ha sido creado se lo asignamos.
        if(enemigos.containsKey(type)){
            enemigo = enemigos.get(type);
        }else{
            switch (type){
                case "Private":
                System.out.println("Solado Creado");
                enemigo = new Private();
                break;
                case "Detective":
                    System.out.println("Detective Creado");
                    enemigo = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            //Una vez creado el enemigo lo insertamos en el hastmap
            enemigos.put(type, enemigo);
        }
        return enemigo;
    }


}
