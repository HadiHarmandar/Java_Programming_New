package day12_customMethods;

public class CustomMethodIntro {

    /*public  static void greetings(){

        System.out.println("Hello Cydeo");     !!!!!!   before main class or after doesn't matter !!!!!!!
        System.out.println("How are yo today?");
        System.out.println("Are you ready to learn Java?");

    }   !!!!!! inside the class  BUT outside  other methods   !!!!!!
     */

    public static void main(String[] args){
        System.out.println("Test started");
        greetings();
        System.out.println("Test completed");
        System.out.println("----------------------------------------------------------");
        displayMessage();
    }

    public  static void greetings(){
        System.out.println("Hello Cydeo");
        System.out.println("How are yo today?");
        System.out.println("Are you ready to learn Java?");
    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Java");
    }
}
