package com.guava.gper;

public class Question {
    private String name;

    private String ask;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public Question(String name, String ask) {
        this.name = name;
        this.ask=ask;
    }
}
