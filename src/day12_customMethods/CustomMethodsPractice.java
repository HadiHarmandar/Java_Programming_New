package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(10.5, 20.5);
        System.out.println("---------------------------------------------------");

        maxNum(15000, 16000);
        System.out.println("---------------------------------------------------");

        maxNum(-200, -20);
        System.out.println("---------------------------------------------------");

        initial("Mohammed", "Karim");
        System.out.println("---------------------------------------------------");

        initial("Hasan", "Ayhan");
        System.out.println("---------------------------------------------------");

        initial("Java", "Programming");
    }

    // create a method that can print the maximum number between two numbers,
    // if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        } else {
            System.out.println("Equal");
        }
    }

    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initial(String firstName, String lastName) {

        String initial = (firstName.charAt(0) + "").toUpperCase() + "." + (lastName.charAt(0) + "").toUpperCase();

        System.out.println("initial is: " + initial);
    }
}
