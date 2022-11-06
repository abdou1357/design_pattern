package com.beyn.designpattern.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        PaimentContaext context = new PaimentContaext(new PaypalPaiement());
        context.executePaiment();
        context.setStrategy(new CashPayement());
        context.executePaiment();
        context.setStrategy(null);
        context.executePaiment();
        context.setStrategy(new CustonPaiement());
        context.executePaiment();


    }
}
