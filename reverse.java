package com.sanjay.main;

import java.util.*;

class ReverseNumber {
    public static void reverserNumber(int number)
    {
        if (number < 10) {
            System.out.println(number);
            return;
           }
           else{
                System.out.println(number % 10);
                reverserNumber(number / 10);
            }
        }
        public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        int arr =obj.nextInt();
        System.out.println("the reverse of the given number is ");
        reverserNumber(arr);
    }
}