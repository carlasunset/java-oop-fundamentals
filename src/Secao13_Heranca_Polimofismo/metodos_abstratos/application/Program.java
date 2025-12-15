package Secao13_Heranca_Polimofismo.metodos_abstratos.application;

import Secao13_Heranca_Polimofismo.metodos_abstratos.entities.Circle;
import Secao13_Heranca_Polimofismo.metodos_abstratos.entities.Rectangle;
import Secao13_Heranca_Polimofismo.metodos_abstratos.entities.Shape;
import Secao13_Heranca_Polimofismo.metodos_abstratos.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Shape> listShape = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle? (r/c)? ");
            char shape = scanner.next().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color = Color.valueOf(scanner.next());
            if(shape  == 'r'){
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                listShape.add(new Rectangle(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                listShape.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : listShape){
            System.out.printf(String.format("%.2f%n", shape.area()));
        }
    }
}
