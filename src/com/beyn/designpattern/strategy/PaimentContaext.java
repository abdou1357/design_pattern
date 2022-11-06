package com.beyn.designpattern.strategy;

public class PaimentContaext {

    private Strategy strategy;

    public PaimentContaext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executePaiment(){
        if(strategy==null){
            System.err.println("vous n'avez aucun moyen de paiment .....");
            return;
        }
        strategy.pay();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
