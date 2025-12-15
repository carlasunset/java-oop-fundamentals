package Section08_Object_Oriented_Introduction.exercicios.notas_aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("First grade: ");
        double firstGrade = scanner.nextDouble();
        System.out.print("Second grade: ");
        double secondGrade = scanner.nextDouble();
        System.out.print("Third grade: ");
        double thirdGrade = scanner.nextDouble();

        Student stu = new Student(name, firstGrade, secondGrade, thirdGrade);

        stu.finalGrade();

        scanner.close();
    }
}
