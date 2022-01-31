package com.sanjay.main;

import java.util.Scanner;

public class temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("how many days temp ?");
        int sum=0;
        int num=sc.nextInt();
        int temp []=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Day "+ (i+1) + "'a high temp");
             temp[i] = sc.nextInt();
             sum+=temp[i];
        }
        double avg=(double) sum/num;
        int above=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>avg){
                above++;
            }
        }
        System.out.println();
        System.out.println("Avg = " +avg);
        System.out.println(above + "day above avg");
    }
}
