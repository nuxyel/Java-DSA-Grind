package com.nuxyel.basics;

import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;
        for (int i = 1 ; i <=N ; i++){
            x = x * i;
        }
        System.out.println(x);
        sc.close();
    }
}
