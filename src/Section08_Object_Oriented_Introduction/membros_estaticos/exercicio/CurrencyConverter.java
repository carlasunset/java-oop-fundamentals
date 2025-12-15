package Section08_Object_Oriented_Introduction.membros_estaticos.exercicio;

public class CurrencyConverter {

        public static double converter(double dollarPrice, double dollarAmount){
            double reaisPrice = dollarPrice * dollarAmount;
            double iof = reaisPrice * 0.06;
            return reaisPrice + iof;
    }
}
