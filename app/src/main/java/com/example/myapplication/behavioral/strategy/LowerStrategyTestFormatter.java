package com.example.myapplication.behavioral.strategy;

//ConcreteStrategy
public class LowerStrategyTestFormatter implements StrategyTextFormatter {

    @Override
    public void format(String text) {
        System.out.println("Texto en Minusculas " + text.toLowerCase());
    }
}
