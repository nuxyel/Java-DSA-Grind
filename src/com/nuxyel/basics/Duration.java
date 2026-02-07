package com.nuxyel.basics;

import java.util.Scanner;

public class Duration {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int initHour = sc.nextInt();
        int finHour = sc.nextInt();
        int duration;
        if (initHour < finHour){
            duration = finHour - initHour;
        } else {
            duration = 24 - initHour + finHour;
        }
        System.out.printf("DURATION = %d HOURS", duration);
        sc.close();
    }
}
