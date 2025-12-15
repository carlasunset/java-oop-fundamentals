package Section13_Inheritance_Polymorphism.exercicio_polimorfismo;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Customs fee: $ " + customsFee + ")";
    }

    public double totalPrice(){
        return super.getPrice()  + customsFee;
    }

}
