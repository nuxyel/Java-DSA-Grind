package com.nuxyel.basics;

import java.util.Scanner;

public class CircleArea {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * (Math.pow(raio, 2.0));

        System.out.printf("%.4f", area);
    }
}
