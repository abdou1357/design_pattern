package com.beyn.designpattern.decorator;

public class Cafe extends Boisson{

    public Cafe() {
        description="cafe";
    }

    @Override
    public double cout() {
        return 7.0;
    }
}
