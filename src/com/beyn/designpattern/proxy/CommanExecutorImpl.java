package com.beyn.designpattern.proxy;

public class CommanExecutorImpl implements CommanExecutor{
    @Override
    public void executeCommand(String cmd) {
        System.out.println("Your command "+cmd+ " is successfully executed");
    }
}
