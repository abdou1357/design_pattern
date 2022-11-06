package com.beyn.designpattern.decorator;

public class Lait extends BoissonDecorator{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 5.0+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }
}
