package com.nuxyel.basics;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is even");
        } else System.out.println(number + " is odd");

        sc.close();
    }
}
