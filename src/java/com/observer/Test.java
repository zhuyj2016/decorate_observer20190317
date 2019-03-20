package com.observer;

public class Test {

    public static void main(String[] args) {
        Guper guper =Guper.getInstance();
        guper.addObserver(new Teacher("tom"));
        guper.addObserver(new Teacher("mic"));
        Question q1 = new Question("小丽","guava是什么");
        Question q2 = new Question("阿奇","redis 为什么快");
        guper.publish(q1);
        guper.publish(q2);

    }
}
