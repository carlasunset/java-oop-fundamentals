package Section08_Object_Oriented_Introduction.exercicios.rectangle;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        Rectangle rec = new Rectangle(width, height);
        System.out.println("AREA: " + rec.area());
        System.out.println("PERIMETER: " + rec.perimeter());
        System.out.print("DIAGONAL: " + rec.diagonal());

        scanner.close();
    }
}
