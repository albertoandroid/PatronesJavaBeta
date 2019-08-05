package com.example.myapplication.behavioral.templatemethod;

/*
La clase abtracta Payment contiene el método plantilla makePayment y la implmentación de pasos que
será igual para todos los tipos metodos de pago.

 */
public abstract class Payment {

    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    /*
    Este es el método plantilla. Debe ser final, puesto que nadie debe volver
    a implementarlo y cambiar el orden de los pasos.
     */
    public final void makePayment(){

        initialize();
        startPayment();
        endPayment();
    }
}
