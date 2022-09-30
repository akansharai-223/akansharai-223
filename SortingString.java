package com.learner;

import java.util.Scanner;
import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
//        Create an object of scanner class
        Scanner sc = new Scanner(System.in);
//        Take Input from user to enter your String:
        System.out.println(" Enter your String name: ");
        String str = sc.next();
//        convert the string into a char array:
        char[] arr = str.toCharArray();
//        Using Array.sort() method to sort our String in increasing method:
        Arrays.sort(arr);
//        making the string from array:
        str = new String(arr);
        System.out.println("Print the Sorted string: " +str);
    }
}
