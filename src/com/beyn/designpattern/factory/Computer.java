package com.beyn.designpattern.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return "Ma config : RAM:: "+getRam()+" :: HDD :: "+getHdd()+" :: CPU :: "+getCpu();
    }
}
