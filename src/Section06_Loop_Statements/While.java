package Section06_Loop_Statements;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0){
            sum += number;
            number = sc.nextInt();
        }

        System.out.println(sum);

    }
}
