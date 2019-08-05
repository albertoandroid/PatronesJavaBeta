package com.example.myapplication.behavioral.strategy;

/*
Definimos una estrategia concreta llamada CapitalStrategyTextFormatter que encapsula nuestro algoritmo de comportamiento
 */
public class CapitalStrategyTextFormatter implements StrategyTextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Texto en Mayusculas " + text.toUpperCase());
    }
}
