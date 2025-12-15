package Section16_Interfaces.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        System.out.print("Data dd/MM/yyyy: ");
        Date data = formatter.parse(scanner.next());
        System.out.print("Valor do contrato: ");
        double valorContrato = scanner.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = scanner.nextInt();

        scanner.close();

    }
}
