package Section05_Conditional_Statements;

import java.util.Scanner;

public class SwitchCaseExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an option from 1 to 7 to print the corresponding day of the week: ");

        String weekDay;
        int option = sc.nextInt();


        switch (option){
            case 1:
                weekDay = "sunday";
                break;
            case 2:
                weekDay = "monday";
                break;
            case 3:
                weekDay = "tuesday";
                break;
            case 4:
                weekDay = "wednesday";
                break;
            case 5:
                weekDay = "thursday";
                break;
            case 6:
                weekDay = "friday";
                break;
            case 7:
                weekDay = "saturday";
                break;
            default:
                weekDay = "invalid option";
                break;
        }

        System.out.println("Day of the week: " + weekDay);
        sc.close();

        /* Switch expression: https://docs.oracle.com/en/java/javase/17/language/switch-expressions-and-statements.html
            dia = switch (option) {
            case 1 -> "sunday";
            case 2 -> "monday";
            case 3 -> "tuesday";
            case 4 -> "wednesday";
            case 5 -> "thursday";
            case 6 -> "friday";
            case 7 -> "saturday";
            default -> "invalid option";
        };
        */
    }
}
