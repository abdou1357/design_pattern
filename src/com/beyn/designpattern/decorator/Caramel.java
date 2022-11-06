package com.beyn.designpattern.decorator;

public class Caramel extends BoissonDecorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2.0+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "au caramel";
    }
}
