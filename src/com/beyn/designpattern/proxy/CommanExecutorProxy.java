package com.beyn.designpattern.proxy;

public class CommanExecutorProxy implements CommanExecutor {
    private boolean isAdmin = false;
    private CommanExecutor commanExecutor;

    public CommanExecutorProxy(String login, String password) {
        isAdmin = ("abdou".equals(login) && "pass".equals(password));
        commanExecutor = new CommanExecutorImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
        if (isAdmin) {
            commanExecutor.executeCommand(cmd);
        }else{
            if(cmd.contains("rm")){
                throw new Exception("You don't have permission to remove some thing");
            }else {
                commanExecutor.executeCommand(cmd);
            }
        }
    }
}
