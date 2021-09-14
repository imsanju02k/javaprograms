package com.sanjay.main;

import java.util.*;


class Main {

    public static void main(String[] args) {
        int max,lcm = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the 2 values:");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        if (n1 > n2) {
            max = n1;
        } else{
            max = n2;
        }
        while (n1 != 0) {

            if (max%n1==0 && max%n2==0){
                lcm=max;
                break;
            }
             max++;
        }
        System.out.print(lcm);

    }
}



