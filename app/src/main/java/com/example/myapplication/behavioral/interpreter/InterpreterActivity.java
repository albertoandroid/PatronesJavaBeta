package com.example.myapplication.behavioral.interpreter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.myapplication.R;

/*
El patron Interpreter es un patron de comportamiento que dado un lenguaje
define una representación para su gramática junto con un interprete del lenguaje.

Este patrón se suele utilizar para definir un lenguaje para representar
expresiones regulares que representen cadenas a buscar dentro de otras cadenas.

Basicamente si nos encontramos con un tipo particular de problema con frecuenca
podemos utilizar dicho patron para expresr los diferentes casos del problema como
sentcias de un leguaje simple. Luego creamos un interprete que resuelva
nuestro problema interpretando dichas sentencias.

Abstract Expresion: declara la interfaz para la ejecución de una operación
Terminal Expression: Implemente una operación con los simbolos terminales de la
gramatica
NonterminalExpresion: implmeenta una operación de interpretación asociada con los
simbolos no terminales de la gramatica
Context: Contiene el contexgto para el interprete
Cliente: es un arbol sintactico abstracto que representa una sentencia particular
en el leguaje que la gramatica define. Basicamente es el encargado de contruir
la expresión
 */

public class InterpreterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter);


    }

    public Expression getNumberExpression(){
        Expression cero = new TerminalExpression("0");
        Expression uno = new TerminalExpression("1");
        Expression containsBoolean = new OrExpression(cero, uno);
        Expression containsOneAndCero = new AndExpfession(cero, uno);
        Log.d("TAG1", containsBoolean.interpret("cero") + "ff");
        Log.d("TAG1", containsBoolean.interpret("0") + "ff");

        Log.d("TAG1", containsOneAndCero.interpret("cero, 0") + "ff");

        Log.d("TAG1", containsOneAndCero.interpret("cero, 0") + "ff");

        Log.d("TAG1", containsOneAndCero.interpret("1, 0") + "ff");

        Log.d("TAG1", allOnesAndZeros.interpret("1, 0, 5") + "ff");

        Log.d("TAG1", allOnesAndZeros.interpret("5, 6") + "ff");

    }
}

/*
Ventajas:
Es facil cambiar la gramatica, a través de la herencia.
Es sencillo introducir nuevas formas de interpretar las expresiones en la gramatica

Desventajas:
Rara vez se utiliza dicho patrón, se puede decir que este es de los que menos vas
a usar, a no ser que tengas que hacer alguno vez una aplicación de lo que trata
el patrón.
Además no es un patrón eficiente en cuestiones de rendimiento.

Las gramaticas complejas son difiles de mantener. Al menos necesitas
unca clase por cada regla que sumes a la gramatica por lo tanto se puede
hacer muy complejo.
 */
