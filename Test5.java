package com.learner;
@FunctionalInterface interface Sayables{
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class Test5 implements  Sayables {
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.say("I am here...");
    }
}
