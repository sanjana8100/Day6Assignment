package com.bridgelabz;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        System.out.println("**********************************");
        System.out.println("Original Number: " +num);
        int n,rev=0;
        while(num!=0){
            n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        System.out.println("Reversed Number: " +rev);
    }
}
