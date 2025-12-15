package Secao05_Estruturas_Condicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 4;

        System.out.println("Bom dia!");

        //condição simples
        if (x > 5) {
            System.out.println("Boa Tarde!");
        }

        System.out.println("Boa Noite!");

        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.println("Que horas são?");
        hora = sc.nextInt();

        //condição composta
        if (hora < 12) {
            System.out.println("Bom dia!");
        }else if (hora < 18){
            System.out.println("Boa Tarde!");
        }else {
            System.out.println("Boa Noite!");
        }

        sc.close();
        

    }
}
