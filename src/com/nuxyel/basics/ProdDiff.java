package com.nuxyel.basics;

import java.util.Scanner;

public class ProdDiff {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diff = a * b - c *d;

        System.out.println(diff);
    }
}
