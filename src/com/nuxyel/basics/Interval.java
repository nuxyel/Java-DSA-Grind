package com.nuxyel.basics;

import java.util.Scanner;

public class Interval {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int in = 0;
        int out = 0;
        for ( int i = 0; i < x ; i++){
            int y = sc.nextInt();

            if (y >= 10 && y <= 20){
                in ++;
            } else { out ++;}
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}