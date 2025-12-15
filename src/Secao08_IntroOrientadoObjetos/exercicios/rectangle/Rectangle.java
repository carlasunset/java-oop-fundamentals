package Secao08_IntroOrientadoObjetos.exercicios.rectangle;

public class Rectangle {

    private Double width;
    private Double height;

    public Rectangle() {

    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (height + width);
    }

    public double diagonal(){
        return Math.sqrt(height * height + width * width);
    }
}
