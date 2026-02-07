package com.nuxyel.basics;

import java.util.Scanner;

public class Area {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangleArea = A * C / 2;
        double pi = 3.14159;
        double circleArea = pi * Math.pow(C, 2.0);
        double trapezeArea = (A + B) /2 * C;
        double squareArea = Math.pow(B, 2.0);
        double rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangleArea, circleArea, trapezeArea, squareArea, rectangleArea);

        sc.close();
    }
}
