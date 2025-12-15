package Section06_Loop_Statements;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0){
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println(soma);


    }
}
