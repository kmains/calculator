package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        System.out.println("/********************//");
        System.out.println("//*** Gimme sum numbers ***//");
        System.out.println("//**************************//");
        int a = kb.nextInt();
        System.out.println("and: ");
        int b = kb.nextInt();
        System.out.println(a +" + "+b+" = "+add(a, b));
    }

    public static int add(int a, int b){
        int c = a+b;

        return c;
    }
}
