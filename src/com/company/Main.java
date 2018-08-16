package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        char op = ',';

        System.out.println("Welcome to a super basic calculator. \n" +
                "Would you like to 1. Add \n" +
                "2. Subtract \n" +
                "3. Multiply \n" +
                "4. Divide");
        int choice = kb.nextInt();
        switch(choice){
            case 1:
                op = '+';
                break;
            case 2:
                op = '-';
                break;
            case 3:
                op = '*';
                break;
            case 4:
                op = '/';
                break;
            default:
                op = '+';
                break;
        }
        System.out.println("First Number: ");
        int x = kb.nextInt();

        System.out.println("Second Number: ");
        int y= kb.nextInt();

        System.out.println(x +" "+op+" "+y+" = "+ eval(choice, x, y));
    }

    public static double eval(int x, int a, int b){
        double ans;
        switch(x){
            case 1:
               ans = add(a,b);
                break;
            case 2:
                ans = sub(a,b);
                break;
            case 3:
                ans = mult(a,b);
                break;
            case 4:
                ans = div(a,b);
                break;
            default:
                ans = add(a,b);
        }

        return ans;
    }

    public static int add(int a, int b){
        int c = a+b;

        return c;
    }
    public static int sub(int a, int b){
        int c = a-b;

        return c;
    }
    public static int mult(int a, int b){
        int c = a*b;

        return c;
    }
    public static double div(int a, int b){
        double c = a/b;

        return c;
    }
}
