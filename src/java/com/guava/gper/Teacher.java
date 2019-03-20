package com.guava.gper;

import com.google.common.eventbus.Subscribe;


public class Teacher  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question q){

        System.out.println("来自"+Guper.getInstance().name+"的提问："+this.name+"老师，"+q.getName()+"提交了一个问题，如下："+q.getAsk());
    }
}
