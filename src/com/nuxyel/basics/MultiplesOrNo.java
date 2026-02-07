package com.nuxyel.basics;

import java.util.Scanner;

public class MultiplesOrNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Multiples");
        } else System.out.println("Not Multiples");
        sc.close();
    }
}
