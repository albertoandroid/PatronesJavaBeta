package com.example.myapplication.singlenton;

public class Card {

    //Aqui es donde esta la clave de singlenton,  nos declaramos una variable del mismo tipo
    //de la clase que estamos creando, por conventio se le sule dar el el nombre de instancia.
    // tenemos esta variable que es la que se instancia
    //y es la que siemrpe se devuelve.
    //Se le suele dar el nombre standar de instace por lo general.
    private static Card INSTANCE;

    private String cardNumber;

    /*
    Tenemos un constructor privado para que no podamos hacer un new Card() desde
    otro lugar que no sea la clase.
     */
    private Card(){

    }

    /*
    Para poder obtener la única instancia de la clase, se deberá convocar al método
    getInstace() desde cualquier parte del programa.
    Como el if solo es ture la primera vez solo se instrancia una vez
     */

    /*
    Con synchonized method controlamos el acceso simultaneo.
    Es decir si por ejemplo hay dos hilos que quieren acceder al metodo
    nos aseguramos de que es controlado y por lo tanto no entran los dos a la vez
    y nos crean dos instancias.
     */
    public synchronized static Card getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
