package com.guava.gper;

import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        EventBus guper = Guper.getInstance();
        guper.register(new Teacher("tom"));
        guper.register(new Teacher("mic"));
        guper.post(new Question("xiaozhu","多路复用"));

    }
}
