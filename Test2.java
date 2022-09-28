package com.learner;

@FunctionalInterface
 interface Interf{
    public int cube(int n);
}
public class Test2 {
    public static void main(String[] args) {
        Interf i = n->n*n*n;
        System.out.println(i.cube(3));
        System.out.println(i.cube(4));
    }
}
