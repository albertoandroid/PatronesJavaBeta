package com.example.myapplication.behavioral.visitor;

import android.util.Log;

public class BlackCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        Log.d("TAG1", "Descuento del 10% en Gasolina por tener tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        Log.d("TAG1", "Descuento del 25% en Vuelos por tener tu tarjeta Black");
    }
}
