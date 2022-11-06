package com.beyn.designpattern.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Boisson espresso=new Espresso();
        System.out.println("Description :"+espresso.getDescription()+" | Prix :"+espresso.cout());
        espresso=new Lait(espresso);
        System.out.println("Description :"+espresso.getDescription()+" | Prix :"+espresso.cout());
        espresso=new Chocolat(espresso);
        System.out.println("Description :"+espresso.getDescription()+" | Prix :"+espresso.cout());
    }
}
