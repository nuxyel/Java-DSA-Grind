package com.nuxyel.basics;

import java.util.Scanner;

public class Division {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double result;

            if (b == 0) {
                System.out.println("Impossible Division");
            } else {
                result = (double) a / b;
                System.out.printf("%.1f\n", result);
            }
        }
        sc.close();
    }
}