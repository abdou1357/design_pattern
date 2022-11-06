package com.beyn.designpattern.strategy;

public class CrediCardPaiment implements Strategy{
    @Override
    public void pay() {
        System.out.println("CrediCardPaiment effectué avec susses");
    }
}
