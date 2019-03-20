package com.observer;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
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

    @Override
    public void update(Observable o, Object arg) {
//        Guper guper = (Guper) o;
//        List<Question> l=guper.getList();
//        Iterator it = l.iterator();
//        while (it.hasNext()){
//            Question q = (Question) it.next();
//            System.out.println(this.name+"老师，"+q.getName()+"提交了一个问题，如下："+q.getAsk());
//           // it.remove();
//        }
        Guper gper = (Guper) o;
        Question q = (Question)arg;
        System.out.println("来自"+gper.name+"的提问："+this.name+"老师，"+q.getName()+"提交了一个问题，如下："+q.getAsk());
    }
}
