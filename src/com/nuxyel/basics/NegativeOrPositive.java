package com.nuxyel.basics;

import java.util.Scanner;

public class NegativeOrPositive {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else System.out.println(number + " is neutral");
        sc.close();
    }
}
