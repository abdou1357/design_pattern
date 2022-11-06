package com.beyn.designpattern.chainofresposability;

public class Euro20Dispenser implements DispenceChain{

    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispence(Currency currency) {
        if (currency.getAmount() >= 20) {
            int number = currency.getAmount() / 20;
            int remain = currency.getAmount() % 20;
            System.out.println("Dispensing : " + number + "  de 20€");
            if (remain != 0) {
                chain.dispence(new Currency(remain));
            }
        } else {
            chain.dispence(currency);
        }
    }
}
