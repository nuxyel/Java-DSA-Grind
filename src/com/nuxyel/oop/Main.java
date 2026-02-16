package com.nuxyel.oop;

import com.nuxyel.oop.entities.Rectangle;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter the rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rect.area());
        System.out.printf("PERIMETER = %.2f\n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rect.diagonal());

        sc.close();
    }
}