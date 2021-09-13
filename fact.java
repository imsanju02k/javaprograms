package com.sanjay.main;

import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the n values:");
         int number =obj.nextInt();
         int fact = 1,i=1;
         for(i=1;i<=number;i++){
             fact=(fact *i);
         }
         System.out.println(+number+" is: "+fact);

         }

    }


