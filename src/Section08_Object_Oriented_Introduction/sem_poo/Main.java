package Section08_Object_Oriented_Introduction.sem_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Solucionando um problema sem POO

        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB +xC) / 2;

        double areaX = Math.sqrt(p *  (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB +yC) / 2;

        double areaY = Math.sqrt(p *  (p-yA) * (p-yB) * (p-yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }

        scanner.close();
    }
}
