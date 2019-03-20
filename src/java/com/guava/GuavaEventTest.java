package com.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class GuavaEventTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        GuavaEvent guavaEvent=new GuavaEvent();

        eventBus.register(guavaEvent);

        eventBus.post("tom");

       //从struts到Springmvc的升级
       //struts面向的是类，Springmvc面向的是方法


        //前面两者面向的是类，而guava面向的是方法

        //guava能够轻松落地观察者模式的一种解决方案
    }

}
