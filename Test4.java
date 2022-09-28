package com.learner;
@FunctionalInterface interface  Sayable{
    void say(String msg);
}

public class Test4 implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.say("Hello I am here !");
    }
}
