package com.beyn.designpattern.singeleton;

public class StaticBlockInitializationSingeleton {
    private static StaticBlockInitializationSingeleton instance;
    private StaticBlockInitializationSingeleton() {
    }
    static {
        try {
            instance=new StaticBlockInitializationSingeleton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static StaticBlockInitializationSingeleton getInstance(){
        System.out.println("Static Block singelton");
        return instance;
    }
}
