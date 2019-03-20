package com.guava.gper;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import java.util.Observable;

public class Guper extends EventBus {


    public String name ="闲聊社区";


    private final static Guper guper = new Guper();

    private Guper(){}

    public static Guper getInstance(){
        return guper;
    }



//    @Subscribe
//    public void subscribe(Question question){
//
//        System.out.println("问题如下："+question.getAsk());
//    }


}
