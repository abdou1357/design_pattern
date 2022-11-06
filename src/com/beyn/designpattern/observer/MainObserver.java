package com.beyn.designpattern.observer;

import java.util.Objects;

public class MainObserver {

    public static void main(String[] args) {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();
        ONewsChannel1 observer1 = new ONewsChannel1();

        observable.addObserver(observer);
        observable.addObserver(observer1);
        observable.setNews("news");
        System.out.println(observer.getNews().equals("news"));
        System.out.println(observer1.getNews().equals("news"));

}
}
