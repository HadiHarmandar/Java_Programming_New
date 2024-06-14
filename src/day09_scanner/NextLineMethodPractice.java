package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // EnterEnter left in Scanner

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); // Aaron King Daniel + Enter

        System.out.println("Enter your school name:");
        String school_name = input.nextLine(); // Cydeo School + Enter

        System.out.println("Enter your gender:");
        String gender = input.next(); // Male + Enter goes Scanner

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 28 + Enter goes Scanner

        input.nextLine(); // taking out Enters inside Scanner // Clear out the Scanner
        // we have to give extra nextLine method if we are using a nextLine() method after the other methods of Scanner

        System.out.println("Enter your street name:");
        String street_name = input.nextLine();

        input.close();
    }
}
