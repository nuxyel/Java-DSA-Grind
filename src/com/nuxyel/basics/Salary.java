package com.nuxyel.basics;

import java.util.Scanner;

public class Salary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double hourValue = sc.nextDouble();
        double hourWorked = sc.nextDouble();

        double salary = hourValue * hourWorked;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, salary);

    }
}
