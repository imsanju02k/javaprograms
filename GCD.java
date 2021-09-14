package com.sanjay.main;

import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the 2 values:");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        while (n1!=n2){
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        System.out.println("HCF " +n2 );


     }
}



