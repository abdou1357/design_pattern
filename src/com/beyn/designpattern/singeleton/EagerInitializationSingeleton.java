package com.beyn.designpattern.singeleton;

public class EagerInitializationSingeleton {

    private static final EagerInitializationSingeleton instance= new EagerInitializationSingeleton();
    private EagerInitializationSingeleton() {
    }

    public static EagerInitializationSingeleton getInstance(){
        System.out.println("init singelton");
        return instance;
    }
    public static int add(int a ,int b){
        return a+b;
    }
    public static int add(int a ,int b,int c){
        return a+b+c;
    }
}
