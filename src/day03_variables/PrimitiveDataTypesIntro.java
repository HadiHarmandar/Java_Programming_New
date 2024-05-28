package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data;

        // byte a = "Java"; // byte ONLY accept integer values (-128 ~ 127)
        // byte a = 20.5; // byte cannot take decimal numbers
        // byte a = 2000; // out of Byte' range (-128 ~ 127)
        byte a = 20;

        // price of the car is $17500
        short p = 17500;

        System.out.println("p");
        System.out.println(p);

        // salary is $95000
        int s = 95000; // preferred for integer numbers

        System.out.println(s);

        // int n = 9999999999;
        long n = 9999999999L;

        // Gpa is 3.5
        double gpa = 3.5; // preferred for decimal numbers

        float gpa2 = 3.5F;

    }
}
