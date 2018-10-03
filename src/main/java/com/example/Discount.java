package com.example;

        import java.sql.SQLOutput;

public class Discount {
    public static void main(String[] args) {
        int age = 40;
        boolean isVip = true;
        System.out.println("discount = " + getDiscount(11, false));
        System.out.println("discount = " + getDiscount(11, true));
        System.out.println("discount = " + getDiscount(20, false));
        System.out.println("discount = " + getDiscount(20, true));
        System.out.println("discount = " + getDiscount(70, false));
        System.out.println("discount = " + getDiscount(70, true));

    }
    private static int getDiscount (int age, boolean isVip) {
        int discount = 0;
        if (age > 65)   {
            discount = 10;
        } else if (age < 18) {
            discount = 25;
        }
        if (isVip) {
            discount = discount + 5;
        }
        return discount;
    }
}
