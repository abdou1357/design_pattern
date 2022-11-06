package com.beyn.designpattern.decorator;

public class Espresso extends Boisson {
    public Espresso() {
        description = "esspresso";
    }

    @Override
    public double cout() {
        return 10.0;
    }
}
