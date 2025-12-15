package Secao13_Heranca_Polimofismo.metodos_abstratos.entities;
import Secao13_Heranca_Polimofismo.metodos_abstratos.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
