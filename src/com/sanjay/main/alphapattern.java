package com.sanjay.main;

import java.util.Scanner;

public class alphapattern {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=65;
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.println((char) k);
                j=j+1;
            }
            k=k+1;
            i=i+1;
            System.out.println();
        }
    }
}
