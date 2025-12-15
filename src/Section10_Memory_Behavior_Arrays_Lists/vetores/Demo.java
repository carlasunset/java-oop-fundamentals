package Section10_Memory_Behavior_Arrays_Lists.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg  = sum / n;
        System.out.printf("Média das alturas: %.2f%n" , avg);

        scanner.close();
    }
}
