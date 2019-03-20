package com.observer;

import sun.security.jca.GetInstance;

import java.util.*;

public class Guper extends Observable {


    public String name ="闲聊社区";

    private List<Question> list = new LinkedList<>();

    private final static Guper guper = new Guper();

    private Guper(){}

    public static Guper getInstance(){
        return guper;
    }

    public void addAsk(Question s){
        list.add(s);
    }

    public List<Question> getList() {
        return list;
    }

    public void publish(Question q){
        setChanged();
        notifyObservers(q);
    }


}
