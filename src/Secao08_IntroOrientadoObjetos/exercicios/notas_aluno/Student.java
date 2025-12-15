package Secao08_IntroOrientadoObjetos.exercicios.notas_aluno;

public class Student {
    private String name;
    private double fistGrade;
    private double secondGrade;
    private double thirdGrade;

    public Student(String name, double fistGrade, double secondGrade, double thirdGrade) {
        this.name = name;
        this.fistGrade = fistGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFistGrade() {
        return fistGrade;
    }

    public void setFistGrade(double fistGrade) {
        this.fistGrade = fistGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public void finalGrade(){
        double sumGrades = fistGrade + secondGrade + thirdGrade;
        if(sumGrades < 60.0){
            System.out.println("Final grade = " + sumGrades);
            System.out.println("FAILED! MISSING " + (60.0 - sumGrades) + " POINTS!");
        }else {
            System.out.println("Final grade = " + sumGrades);
            System.out.println("PASS!");
        }
    }


}
