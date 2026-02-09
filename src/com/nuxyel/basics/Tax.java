package com.nuxyel.basics;

import java.util.Scanner;

public class Tax {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double tax = 0.0;

        if (salary <= 2000.00) {
            tax = 0.0;
        } else if (salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
        } else if (salary <= 4500.00) {
            tax = (1000.00 * 0.08) + ((salary - 3000.00) * 0.18);
        } else {
            tax = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salary - 4500.00) * 0.28);
        }

        if (tax == 0.0) {
            System.out.println("Dont pay");
        } else {
            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }
}