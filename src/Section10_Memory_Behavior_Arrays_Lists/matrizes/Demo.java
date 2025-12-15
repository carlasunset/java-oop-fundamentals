package Section10_Memory_Behavior_Arrays_Lists.matrizes;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i=0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i=0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i< matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0 ){
                    count++;
                }
            }
        }

        System.out.print("Negative numbers: " + count);

        scanner.close();
    }
}
