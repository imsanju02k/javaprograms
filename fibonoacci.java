package com.sanjay.main;

import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the n values:");
        int number = obj.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println(+number + " is: ");
        while (c<=number){
            System.out.print(+c  );
            a=b;
            b=c;
            c=a+b;
        }

     }
}



