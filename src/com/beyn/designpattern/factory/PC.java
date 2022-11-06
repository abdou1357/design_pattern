package com.beyn.designpattern.factory;

public class PC extends Computer{
    private String ram;
    private String hdd;
    private String CPU;

    public PC(String ram, String hdd, String CPU) {
        this.ram = ram;
        this.hdd = hdd;
        this.CPU = CPU;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.CPU;
    }
}
