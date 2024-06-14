package day08_ternaries_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 130;

        /*
        String  result = "";
        if (score >= 0 && score <= 100){

            if (score >= 60){
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else {
            result = "Invalid";
        }
        System.out.println(result);
         */

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";

        System.out.println(result);

        System.out.println("---------------------------------------------------------");

        int n = 5;

        String day = (n >= 0 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";

        System.out.println(day);


    }
}
