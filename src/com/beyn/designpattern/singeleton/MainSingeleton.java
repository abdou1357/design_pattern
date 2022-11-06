package com.beyn.designpattern.singeleton;

public class MainSingeleton {

    public static void main(String[] args) {
        EagerInitializationSingeleton.getInstance();//1 ere implementation
        StaticBlockInitializationSingeleton.getInstance();//2 eme implementation
        LazyInitializationSingeleton.getInstance();//3 eme implementation
        LazyInitializationSingeleton.getInstance();//3 eme implementation
        System.out.println(EagerInitializationSingeleton.add(5,6));
        System.out.println(EagerInitializationSingeleton.add(5,6,5));
        //4 eme implementation
        for (int i = 0; i < 5; i++) {
            ThreadSafeSingeletion.getInstance();
            ThreadSafeSingeletion.getInstance();
            ThreadSafeSingeletion.getDoubleCheckInstance();
            ThreadSafeSingeletion.getDoubleCheckInstance();
            ThreadSafeSingeletion.getDoubleCheckInstance();
        }
    }
}
