package com.beyn.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel1 implements Observer {
    private String news;

    @Override
    public void update(Observable observable, Object o) {
        this.setNews((String) o);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
