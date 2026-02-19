package com.nuxyel.oop;

import com.nuxyel.oop.utils.CurrencyConverter;

import java.util.Scanner;

public class Dollar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        CurrencyConverter.dollarQuantity = sc.nextDouble();


        System.out.printf("Amount to be paid: %.2f", CurrencyConverter.converter());
    }
}
