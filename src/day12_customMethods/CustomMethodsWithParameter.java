package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(5);

        System.out.println("-----------------------------------------------------");

        oddOrEven(10000);

        int num1 = 100;
        oddOrEven(num1);
        int num2 = 35;
        oddOrEven(num2);
        int num3 = 79;
        oddOrEven(num3);
        int num4 = 39;
        oddOrEven(num4);

        eligibleToBuyAlcohol(26);

        posNegZero(4);

        grade(85);
    }

    // the method takes an argument number, and verifies if the number is odd or even number
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

        /*int num1 = 34;
        oddOrEven(num1);

        int num2 = 43;
        oddOrEven(num2);

        int num3 = 4;
        oddOrEven(num3);

        int num4 = 3;
        oddOrEven(num4);
         */
    }

    // create a method that can check if a person eligible to buy alcohol (age)
    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

    // create a method that can check if a number is positive or negative or zero (number)
    public static void posNegZero(int number1) {
        if (number1 > 0) {
            System.out.println("Positive");
        } else if (number1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // create a method that can calculate a grade of the students (score)
    public static void grade(int score) {
        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C"
                : (score >= 60) ? "D" : "F" : "Invalid Score";
        System.out.println(result);
    }
}
