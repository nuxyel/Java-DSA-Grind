package com.nuxyel.basics;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int code = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double price;

        if (code == 1) {
            price = 4.00;
        } else if (code == 2) {
            price = 4.50;
        } else if (code == 3) {
            price = 5.00;
        } else if (code == 4) {
            price = 2.00;
        } else if (code == 5) {
            price = 1.50;
        } else {
            System.out.println("Invalid code!");
            sc.close();
            return;
        }

        double total = price * quantity;
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
