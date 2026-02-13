package com.nuxyel.basics;

import java.util.Scanner;

public class Divisors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1 ; i <= x ; i++){
            if (x % i == 0){
                System.out.printf("%d\n", i);
            }
        }
    }
}
