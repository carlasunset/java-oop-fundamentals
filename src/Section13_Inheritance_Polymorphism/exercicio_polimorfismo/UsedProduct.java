package Section13_Inheritance_Polymorphism.exercicio_polimorfismo;

import java.time.LocalDate;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + manufactureDate + ")";
    }

}
