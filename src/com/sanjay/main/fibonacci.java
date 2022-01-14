package com.sanjay.main;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int count=scanner.nextInt();
        int n3;
        System.out.print(n1+ " " +n2);
        for (int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
//3 input by user : n1=0 , n2=1,count=10