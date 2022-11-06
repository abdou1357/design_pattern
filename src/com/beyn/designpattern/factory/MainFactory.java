package com.beyn.designpattern.factory;

public class MainFactory {

    public static void main(String[] args) {
        try {
        Computer pc = new ComputerFactory().getComputer("serverx");
        System.out.println(pc);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
