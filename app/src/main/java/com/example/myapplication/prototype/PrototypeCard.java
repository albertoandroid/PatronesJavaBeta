package com.example.myapplication.prototype;

/*
La interfaz cloneable es my simple ya que no define ningun metodo.
Una clase cuando implementa esta interfaz como en nuestro caso PrototypeCArd
le indica al método clone de la clase PrototypeCard que puede hacer una copia
miembro a miembre de las intancias de dicha clase.
Si una clase no implementa la interfaz cloneable y quieres hacer una
copia del bojeto a trvés del método clone nos dará una excepción
del tipo CloneNotSupportedException
 */
public interface PrototypeCard extends Cloneable {

    public void getCard();

    public PrototypeCard clone() throws CloneNotSupportedException;
}
