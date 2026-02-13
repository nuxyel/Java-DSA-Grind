package com.nuxyel.basics;

import java.util.Scanner;

public class SquareAndCube {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int square;
        int cube;

        for (int i = 0 ; i <= x ; i++){
            square = (int) Math.pow(i, 2);
            cube = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d\n", i, square, cube);

        }
        sc.close();
    }
}