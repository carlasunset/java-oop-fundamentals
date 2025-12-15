package Secao08_IntroOrientadoObjetos.membros_estaticos.exercicio;

public class CurrencyConverter {

        public static double converter(double dollarPrice, double dollarAmount){
            double reaisPrice = dollarPrice * dollarAmount;
            double iof = reaisPrice * 0.06;
            return reaisPrice + iof;
    }
}
