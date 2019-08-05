package com.example.myapplication.behavioral.chainofresponsibility;

import android.util.Log;

public class Platinium implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext(){
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if(totalLoan > 10000 && totalLoan <=500000){
            Log.d("TAG1", "Esta solicitud de tarjeta de crédito lo maneja la clase Platinium");
        } else {
            next.creditCardRequest(totalLoan);
        }
    }

}
