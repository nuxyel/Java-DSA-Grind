package com.nuxyel.basics;

import java.util.Scanner;

public class Negatives {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers you are going to insert? ");
        n = sc.nextInt();

        int[] vector = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Type a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Negative Numbers:");

        for (int i=0; i<n; i++) {
            if (vector[i] < 0) {
                System.out.printf("%d\n", vector[i]);
            }
        }

        sc.close();
    }
}
