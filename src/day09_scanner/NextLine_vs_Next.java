package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Enter

        System.out.println("Enter your age and full name:");
        int age = input.nextInt(); // 45 + Enter == 45\n

        input.nextLine(); // takes reads Enter from Scanner

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        input.close();
    }
}
