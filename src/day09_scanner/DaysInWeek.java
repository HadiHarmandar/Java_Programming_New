package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //--> for reuse it "input"

        System.out.println("Enter the day number:");
        // int day = new Scanner(System.in).nextInt(); --> no need to close, one time input

        int num = input.nextInt();
        String day = "Invalid";

        if (num >= 1 && num <= 7) {

            day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
        }

        System.out.println(day);

         /*
         Tasks:
    1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even

    2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

    3. MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name

          */

        System.out.println("Enter a number:");

        int num1 = input.nextInt();

        String oddOrEven = (num1 % 2 == 0) ? "Even" : "Odd";

        System.out.println(oddOrEven);

        System.out.println("Enter age:");
        byte age = input.nextByte();

        String eligible = (age >= 1 && age < 150) ? (age >= 21) ? "Eligible" : "Not Eligible" : "Invalid Age";

        System.out.println(eligible);

        System.out.println("Enter month:");
        int month = input.nextInt();

        String result = "";
        switch (month) {

            case 1:
                result = "January";
                break;

            case 2:
                result = "February";
                break;

            case 3:
                result = "March";
                break;

            case 4:
                result = "April";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "June";
                break;

            case 7:
                result = "July";
                break;

            case 8:
                result = "August";
                break;

            case 9:
                result = "September";
                break;

            case 10:
                result = "October";
                break;

            case 11:
                result = "November";
                break;

            case 12:
                result = "December";
                break;

            default:
                result = "Invalid";
        }

        System.out.println(result);

        input.close();
    }
}
