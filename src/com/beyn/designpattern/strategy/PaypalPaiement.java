package com.beyn.designpattern.strategy;

public class PaypalPaiement implements Strategy{
    @Override
    public void pay() {
        System.out.println("PaypalPaiement effectué avec susses");
    }
}
