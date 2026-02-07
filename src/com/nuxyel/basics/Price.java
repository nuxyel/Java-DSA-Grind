package com.nuxyel.basics;

import java.util.Scanner;

public class Price {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int piece1code = sc.nextInt();
        int piece1num = sc.nextInt();
        double piece1value = sc.nextDouble();
        int piece2code = sc.nextInt();
        int piece2num = sc.nextInt();
        double piece2value = sc.nextDouble();

        double maxvaluepiece1 = piece1num * piece1value;
        double maxvaluepiece2 = piece2num * piece2value;
        double maxvaluetotal = maxvaluepiece1 + maxvaluepiece2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", maxvaluetotal);

    }
}
