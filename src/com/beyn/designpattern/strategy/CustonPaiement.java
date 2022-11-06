package com.beyn.designpattern.strategy;

public class CustonPaiement implements Strategy{
    @Override
    public void pay() {
        System.out.println("CustomPaiment effectué avec susses");
    }
}
