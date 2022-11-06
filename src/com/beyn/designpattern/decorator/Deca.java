package com.beyn.designpattern.decorator;

public class Deca extends Boisson {
    public Deca() {
        description = "deca";
    }

    @Override
    public double cout() {
        return 7.0;
    }
}
