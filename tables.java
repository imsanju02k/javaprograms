package com.sanjay.main;

import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the n values:");
        int number = obj.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}



