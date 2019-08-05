package com.example.myapplication.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.example.myapplication.prototype.PrototypeFactory.CardType.AMEX;
import static com.example.myapplication.prototype.PrototypeFactory.CardType.VISA;

public class PrototypeFactory {

    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();
    static {

    }

    public static PrototypeCard getInstance(final String tipo)
            throws CloneNotSupportedException{

        return ((PrototypeCard)prototypes.get(tipo)).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta Tarjeta es Visa con Número 0000");
        prototypes.put(VISA, visa);

        Amex amex = new Amex();
        visa.setName("Esta Tarjeta es Amex con Numero 1111");
        prototypes.put(AMEX, amex);
    }
}
