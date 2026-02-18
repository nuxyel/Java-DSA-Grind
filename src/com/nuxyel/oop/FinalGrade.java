package com.nuxyel.oop;

import com.nuxyel.oop.entities.Student;

import java.util.Scanner;

public class FinalGrade {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("Name:  ");
        stu.name = sc.nextLine();

        System.out.println("First grade:  ");
        stu.grade1 = sc.nextDouble();

        System.out.println("Second grade:  ");
        stu.grade2 = sc.nextDouble();

        System.out.println("Third grade:  ");
        stu.grade3 = sc.nextDouble();
        if (stu.validation()) {
            System.out.println("FINAL GRADE = " + stu);
            stu.verification();
        }
    }



}
