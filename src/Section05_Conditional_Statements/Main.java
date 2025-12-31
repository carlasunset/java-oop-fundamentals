package Section05_Conditional_Statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 4;

        System.out.println("Good morning!");

        //simple condition
        if (x > 5) {
            System.out.println("Good afternoon!");
        }

        System.out.println("Good night!");

        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.println("What time is it?");
        hora = sc.nextInt();

        //compound conditionals
        if (hora < 12) {
            System.out.println("Good morning!");
        }else if (hora < 18){
            System.out.println("Good afternoon!");
        }else {
            System.out.println("Good night!");
        }

        sc.close();
        

    }
}
