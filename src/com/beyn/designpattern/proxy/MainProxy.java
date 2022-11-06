package com.beyn.designpattern.proxy;

public class MainProxy {

    public static void main(String[] args) {
        CommanExecutor commanExecutor=new CommanExecutorProxy("abdou","pass");
        try {
        commanExecutor.executeCommand("ls /abderrahmanecheridi/home/out");
        commanExecutor.executeCommand("rm /abderrahmanecheridi/home/out");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
