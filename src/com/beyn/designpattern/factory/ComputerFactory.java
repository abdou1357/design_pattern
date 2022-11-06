package com.beyn.designpattern.factory;

public class ComputerFactory {

    public Computer getComputer(String type) {
        switch (type) {
            case "pc":
                return new PC("8 Go", "250 Go", "2.3 Ghz");
            case "gamer":
                return new PcGamer("16 Go", "2 To SSD", "4.3 Ghz");
            case "server":
                return new Server("32 Go", "5 To SSD", "6.3 Ghz");
            default:
                 throw new IllegalArgumentException("ce type n'existe pas");

        }

    }
}
