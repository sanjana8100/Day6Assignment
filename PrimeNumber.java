package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println(num + " is a PRIME Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}
