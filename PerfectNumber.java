package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        long num= in.nextLong();
        long sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            System.out.println(num+ " is a PERFECT Number.");
        else
            System.out.println(num+ " is NOT a Perfect Number.");
    }
}
