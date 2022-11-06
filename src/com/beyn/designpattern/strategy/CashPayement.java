package com.beyn.designpattern.strategy;

public class CashPayement implements Strategy{
    @Override
    public void pay() {
        System.out.println("CashPayement effectué avec susses");
    }
}
