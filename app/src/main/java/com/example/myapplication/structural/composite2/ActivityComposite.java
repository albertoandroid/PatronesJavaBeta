package com.example.myapplication.structural.composite2;

public class ActivityComposite {

    /*
    El patrón composite es utilizado para construi objetos o algoritmos complejos a partir
    de objetos o algoritmos más simples y que son parecidos entre si, todo esto gracias
     a la composición recursiva y a una estructura en forma de árbol.

     Otra forma de decirlo es que El patrón composite nos permite consturir objetos complejos
     componiendo de forma
     recursiva objetos similares en una estrutura de arbol.
     Como todos los objetos o algoritmos tienes una interfaz común nos simplica el tratamiento
     puesto que los podemos tratar a todos de la misma manera.

     Component -> Declara la interfaz para los objetos en la composiciòn
     Implementa el comportamiento predeterminado para la interfaz común.
     Delara una interfaz para acceder y gestionar sus componenetes secundarios

     Leaf -> Representa objetos leaf en la composición. Un leaf no tiente hijos.
     Composite -> Define el comportamiento de los componentes que tienen los hijos.
     Almacena los componetes hijos.

    Cliente-> Manipula objeos en la compoosicón a través de la interfaz de componentes.
     */

    private void metodo(){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Alberto");

        CuentaComponent cuentaAhorro = new CuentaAhorro(8000.0, "Alberto");

        CuentaComposite cuentaComposite = new CuentaComposite();

        cuentaComposite.addCuenta(cuentaAhorro);
        cuentaComposite.addCuenta(cuentaCorriente);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();
    }




}
