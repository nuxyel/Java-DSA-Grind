package com.nuxyel.oop.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public boolean validation() {
        boolean valid = true;
        if (this.grade1 > 30) {
            System.out.println("The first grade must be under 30.00");
            valid = false;
        }
        if (this.grade2 > 35 || this.grade3 > 35) {
            System.out.println("The second and third grade must be under 35.00");
            valid = false;
        }
        return valid;
    }
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    public void verification() {
        if (this.finalGrade() >= 60) {
            System.out.println("PASSED");
        } else {
            double missing = (60 - finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", missing);
        }

    }
    public String toString() {
        return String.format("%.2f", finalGrade());
    }

}