package Section06_Loop_Statements;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int repeticao = scanner.nextInt();
        int soma = 0;

        for (int index=0; index<repeticao; index++){
            int numeros = scanner.nextInt();
            soma += numeros;
        }
        System.out.println(soma);
    }
}
