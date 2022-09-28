package com.learner;

public class Test3 {
    public static void main(String[] args) {
//        @FunctionalInterface
        Runnable r = ()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread t =new Thread(r);
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
