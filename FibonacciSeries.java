package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed in the Fibonacci Series:");
        int totalterms= in.nextInt();
        int num1=0, num2=1, num3;
        System.out.println("******************************************");
        System.out.println("The Fibonacci Series:");
        System.out.print(num1+" "+num2);
        for(int i=2;i<totalterms;i++){
            num3= num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
