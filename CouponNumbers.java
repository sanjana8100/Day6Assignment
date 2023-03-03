package com.bridgelabz;

import java.util.Scanner;

public class CouponNumbers {

    static String[] couponArray;
    static String generateCoupon(){
        String str = "";
        for(int i = 0; i <= 4; i++) {
            int randomDigit = (int)(Math.random()*10);
            str = str + randomDigit;
        }
        String checkedDuplicacy = checkCoupons(str);
        return checkedDuplicacy;
    }
    static String checkCoupons(String newCoupon) {
        int check = 0;
        for(String existing : couponArray)
            if (newCoupon == existing)
                check++;
        if (check != 0)
            generateCoupon();

        return newCoupon;
    }
    public static void main(String[] args) {
        String str = "";
        System.out.print("How many coupon numbers you want? : ");
        Scanner sc=new Scanner(System.in);
        int coupons = sc.nextInt();
        couponArray = new String[coupons]; // array

        for(int i = 0; i < coupons; i++) {
            str = generateCoupon();
            System.out.println("Coupon Number "+(i+1)+" :	"+str);
        }
        sc.close();
    }
}
