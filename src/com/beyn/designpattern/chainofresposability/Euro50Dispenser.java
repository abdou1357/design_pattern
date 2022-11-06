package com.beyn.designpattern.chainofresposability;

public class Euro50Dispenser implements DispenceChain {

    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispence(Currency currency) {
        if (currency.getAmount() >= 50) {
            int number = currency.getAmount() / 50;
            int remain = currency.getAmount() % 50;
            System.out.println("Dispensing : " + number + "  de 50€");
            if (remain != 0) {
                chain.dispence(new Currency(remain));
            }
        } else {
            chain.dispence(currency);
        }
    }
}
