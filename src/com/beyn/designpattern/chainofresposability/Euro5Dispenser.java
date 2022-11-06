package com.beyn.designpattern.chainofresposability;

public class Euro5Dispenser implements DispenceChain{
    private DispenceChain chain;

    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispence(Currency currency) {
        if (currency.getAmount() >= 5) {
            int number = currency.getAmount() / 5;
            int remain = currency.getAmount() % 5;
            System.out.println("Dispensing : " + number + "  de 5€");
            if (remain != 0) {
                chain.dispence(new Currency(remain));
            }
        } else {
            chain.dispence(currency);
        }
    }
}
