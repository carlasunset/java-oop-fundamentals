package Secao08_IntroOrientadoObjetos.com_poo.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p *  (p-a) * (p-b) * (p-c));
    }

    public static void largerArea(Triangle x, Triangle y) {
        if (x.area() > y.area()) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }



}


