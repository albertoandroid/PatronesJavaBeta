package com.example.myapplication.behavioral.chainofresponsibility;

public interface ApproveLoanChain {

    public void setNext(ApproveLoanChain loan);
    public ApproveLoanChain getNext();
    public void creditCardRequest(int totalLoan);
}
