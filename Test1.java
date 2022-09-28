package com.learner;
@FunctionalInterface interface Interfa{
    public void add(int a, int b);
}

public class Test1 {
    public static void main(String[] args) {
        Interfa i = (a,b)-> System.out.println("The Sum : " +(a+b));
        i.add(10,23);
        i.add(14,33);
        i.add(16,25);
        i.add(60,63);
        i.add(20,27);

    }
}


