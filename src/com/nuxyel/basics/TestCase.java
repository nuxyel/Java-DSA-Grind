package com.nuxyel.basics;

import java.util.Scanner;

public class TestCase {
    static void main() {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            for ( int i = 0; i < x ; i++){
                double y1 = sc.nextDouble();
                double y2 = sc.nextDouble();
                double y3 = sc.nextDouble();

                double result;
                result = ((y1 * 2) + (y2 * 3) + (y3 * 5)) / 10;

                System.out.printf("%.1f\n", result);
            }
            sc.close();
    }
}
