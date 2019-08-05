package com.example.myapplication.behavioral.visitor;

import android.util.Log;

public class ClassicCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        Log.d("TAG1", "Descuento del 3% en Gasolina por tener tu tarjeta Clásica");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        Log.d("TAG1", "Descuento del 5% en Vuelos por tener tu tarjeta Clásica");
    }
}
