package com.nuxyel.basics;

import java.util.Scanner;

public class Intervals {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if (value < 0 || value > 100) {
            System.out.println("Out of range");
        } else if (value <= 25) {
            System.out.println("Interval [0,25]");
        } else if (value <= 50) {
            System.out.println("Interval (25,50]");
        } else if (value <= 75) {
            System.out.println("Interval (50,75]");
        } else {
            System.out.println("Interval (75,100]");
        }

        sc.close();
    }
}
