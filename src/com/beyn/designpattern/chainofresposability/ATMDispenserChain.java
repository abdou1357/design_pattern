package com.beyn.designpattern.chainofresposability;

import java.util.Scanner;

public class ATMDispenserChain {
    private Euro50Dispenser euro50Dispenser;

    public ATMDispenserChain() {
        euro50Dispenser = new Euro50Dispenser();
        Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
        Euro10Dispenser euro10Dispenser = new Euro10Dispenser();
        Euro5Dispenser euro5Dispenser = new Euro5Dispenser();

        //definir la chaine
        euro50Dispenser.setNextChain(euro20Dispenser);
        euro20Dispenser.setNextChain(euro10Dispenser);
        euro10Dispenser.setNextChain(euro5Dispenser);
    }

    public static void main(String[] args) {
        ATMDispenserChain dispenser=new ATMDispenserChain();
        while (true){
            int amount =0;
            System.out.println("enter the amount to dispense :");
            Scanner scanner=new Scanner(System.in);
            amount=scanner.nextInt();
            if(amount%5 !=0){
                System.out.println("the amount should be multiple of 5");
                return;
            }
            dispenser.euro50Dispenser.dispence(new Currency(amount));
        }
    }
}
