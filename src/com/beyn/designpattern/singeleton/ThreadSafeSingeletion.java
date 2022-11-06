package com.beyn.designpattern.singeleton;

public class ThreadSafeSingeletion {
    private static ThreadSafeSingeletion instance;

    private ThreadSafeSingeletion(){

    }

    public static synchronized ThreadSafeSingeletion getInstance(){
        if(instance==null){
            System.out.println("new instance of thread safe singelton");
            instance=new ThreadSafeSingeletion();
            return instance;
        }
        System.out.println("returning instance of thread safe singelton");
        return instance;
    }
    public static ThreadSafeSingeletion getDoubleCheckInstance(){
        if(instance==null){
            synchronized (ThreadSafeSingeletion.class){
                if(instance==null){
                    System.out.println("new instance of thread  double check safe singelton");
                    instance = new ThreadSafeSingeletion();
                }
            }
            return instance;
        }
        System.out.println("returning instance of thread safe double check singelton");
        return instance;
    }
}
