package day09_scanner;

public class EnhanceSwitch {

    public static void main(String[] args) {

        String language = "English";

        switch (language) { // java 17 ==> like lambda expression
            case "English" -> System.out.println("Hello");
            case "Spanish" -> System.out.println("Hola");
            case "Turkish" -> System.out.println("Merhaba");
            default -> System.out.println("Invalid Language");
        }

        System.out.println(language);

    }
}
