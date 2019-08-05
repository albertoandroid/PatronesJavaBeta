package com.example.myapplication.behavioral.strategy;

/*
Definimos nuestra clase Context, donde se pasarán las estrategias
 */
public class CContext {

    private StrategyTextFormatter strategyTextFormatter;

    public Context(StrategyTextFormatter strategyTextFormatter){
        this.strategyTextFormatter = strategyTextFormatter;
    }

    public void publishText(String text){
        strategyTextFormatter.format(text);
    }
}
