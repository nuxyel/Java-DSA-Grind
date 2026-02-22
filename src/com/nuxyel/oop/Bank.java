package com.nuxyel.oop;

import com.nuxyel.oop.entities.Account;

import java.util.Scanner;

public class Bank {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit? (y/n) ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println("Account data:\n" + account);
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: " + account);

        System.out.println("Account data:\n" + account);
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: " + account);

        sc.close();
    }
}
