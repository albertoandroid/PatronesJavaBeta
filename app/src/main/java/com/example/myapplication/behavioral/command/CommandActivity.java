package com.example.myapplication.behavioral.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;

public class CommandActivity extends AppCompatActivity {

    /*
    Es un patrón de comportamiento.
    El patron command es muy util a la hora de abstraer la lógica de negocio en acciones
    discretas que llamamos comandos. Por ello su nombre comand.
    Este objeto command ayuda al acomplamiento entre una clase invocadora que debe llamar
    a un metodo de otra clase Receptora para realizar la operación.

    Este patron se utiliza para encapsular toda la inforamción necesaira para realizar
    una acción o desecadenar un evento en cualqueir momento, lo que nos permite
    descentralizar la logica de negocio.

    En resumidas cuentas el patrón command nos pemrite desacoplar el objetio que invoca
    a una operación de aquellos que tiene el conocmiento necesario para poder realizarla.

    Como siempre estos patrones se ven mejor en código.
     */

    /*
    Command-> es la interfaz para ejecutar una operación
    ConcreteCommand-> define el enlace entre un objeto "Receiver" y una acción.
    Implementea el metodo execuete.
    Cliente-> crear un objeto ComandConcrete y estable su receptor
    Invoker: Le pide a la orden que ejeucte la petición
    Receiver: Sabe como llevar a cabo las operaciones asociadas a una petición.
    Receptor: Puede ser cualquier clase.


    Lo que va a hacer nuestra aplicación, es ofrecernos la opción de dar de alta y de baja una
    tarjeta de credito y los pasos que se deben seguir.
    Por ejemplo para darla de alta se tienen que dar los siguientes comandos:
    1.- Tenemos que enviar el PIN number al cliente
    2.- El cliente la tiene que activar
    3.- Enviamos SMS de confirmación de que la tarjeta esta activada.

    Lo mismo para darla de baja.
    1.- El cliente la tiene que desactivar
    2.- Enviamos mensaje al cliente de que ha sido desactivada.


    1.- Interface Command -> La interaza para ejecutar un commando.
    2.- Payment
    3.- CreditCardActivateCommand ->
    4.- CreditCardInvoker
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);


        CreditCard creditCard = new CreditCard();//receiver 1
        CreditCard creditCard1 = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        invoker.setCommand(new CreditCardDesactivateCommand(creditCard1));
        invoker.run();




    }

    /*
    Ventajas: Hace que nuestro código sea extensible ya que podemos agregar
    nuevos comandos sin cambiar el código existente.
    Reduce el acoplamiento del invoker y el receptor del comando.

    Desventaja: Incrementa el número de clases para cada command
     */
}
