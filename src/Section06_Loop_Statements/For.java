package Section06_Loop_Statements;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int loopRepeat = scanner.nextInt();
        int sum = 0;

        for (int index=0; index < loopRepeat; index++){
            int numbers = scanner.nextInt();
            sum += numbers;
        }
        System.out.println(sum);
    }
}
