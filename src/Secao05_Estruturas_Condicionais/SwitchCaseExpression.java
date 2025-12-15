package Secao05_Estruturas_Condicionais;

import java.util.Scanner;

public class SwitchCaseExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opção de 1 a 7 para imprimir o dia da semana correspondente: ");

        String dia;
        int option = sc.nextInt();


        switch (option){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inváido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();

        /* Switch expression: https://docs.oracle.com/en/java/javase/17/language/switch-expressions-and-statements.html
            dia = switch (option) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor inváido";
        };
        */
    }
}
