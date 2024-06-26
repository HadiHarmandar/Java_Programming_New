package day06_ifStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 10,
                num2 = 100;

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        }

        if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        }

        if (num1 == num2) {
            System.out.println("Equal");
        }

    }
}

/**
 Create a class named MaximumNumber.java
 Declare the following variables:
    1. num1
    2. num2
 Write a program that can print the maximum number between the
 two numbers above, if both are equal then print Equal
    Ex:
        num1 = 10
        num2 = 20
    output:
        20 is the maximum number
 */