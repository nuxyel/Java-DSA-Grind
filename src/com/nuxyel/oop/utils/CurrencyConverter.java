package com.nuxyel.oop.utils;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double dollarQuantity;
    public static double IOF = 0.06;

    public static double converter() {
        return (dollarPrice * dollarQuantity) * (1 + IOF);
    }
}
