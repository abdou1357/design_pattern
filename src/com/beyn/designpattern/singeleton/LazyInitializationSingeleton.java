package com.beyn.designpattern.singeleton;

public class LazyInitializationSingeleton {
    private static LazyInitializationSingeleton instance;

    private LazyInitializationSingeleton(){

    }

    public static LazyInitializationSingeleton getInstance(){
        if(instance==null){
            System.out.println("new instance of lazy singelton");
            instance=new LazyInitializationSingeleton();
            return instance;
        }
        System.out.println("returning the existing instance of lazy singelton");
        return instance;
    }
}
