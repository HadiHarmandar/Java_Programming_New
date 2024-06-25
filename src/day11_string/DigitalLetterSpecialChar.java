package day11_string;

import java.util.Scanner;

public class DigitalLetterSpecialChar {

    public static void main(String[] args) {

        //System.out.println("".charAt(0));

        String str = new Scanner(System.in).nextLine();
        if (str.length() >= 1){ // if string has at least one character

            char f = str.charAt(0);// the first character of string
            if (f >= 48 && f <= 57){ // instead 48 --> '0' && instead 57 --> '9'
                System.out.println("first character is digit");
            } else if (f >= 65 && f <= 90) { // instead 65 --> 'A' && instead 90 --> 'Z'
                System.out.println("first character is uppercase letter");
            } else if (f >= 97 && f <= 122) { // instead 97 --> 'a' && instead 122 --> 'z'
                System.out.println("first character is lowercase letter");
            }else {
                System.out.println("first character is special character");
            }
        }else { // is string is empty
            System.out.println("String is empty ");
        }
    }
}
/**
3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */