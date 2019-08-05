package com.example.myapplication.behavioral.command;

/*
Necesitmaos nuestro Invoker, es decir la clase que simplemente llame al metodo Execute
 */
public class CreditCardInvoker {

    private Command command;

    public CreditCardInvoker(){
    }

    //hacemos un setcomand en runtime.
    public void setCommand(Command command){
        this.command = command;
    }

    //El metodo run nos lanzara el comando que queremos invocar, por
    //ejemplo activar o desactivar la tarjeta de creidto.
    public void run(){
        command.execute();
    }
}
