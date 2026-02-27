package com.nuxyel.basics;

import java.util.Scanner;

public class AgeAndHeight {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many people you are going to insert?");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        double totalHeight = 0;
        int minors = 0;

        for (int i = 0 ; i < n ; i ++) {
            System.out.printf("Person %d data:\n", i+1);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();

            sc.nextLine();

            totalHeight += height[i];
            if (age[i] < 16) {
                minors++;
            }
        }

        double mediumHeight = totalHeight / n;
        double minorsPercent = ((double) minors / n) * 100;

        System.out.printf("Medium height: %.2f\n", mediumHeight);
        System.out.printf("Minors percent and names: %.1f%%\n", minorsPercent);

        for (int i = 0 ; i < n ; i++){
            if(age[i] < 16){
                System.out.println(names[i]);
            }
        }
    }
}
