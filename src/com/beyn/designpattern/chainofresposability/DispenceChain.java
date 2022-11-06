package com.beyn.designpattern.chainofresposability;

public interface DispenceChain {
    void setNextChain(DispenceChain nextChain);
    void dispence(Currency currency);
}
