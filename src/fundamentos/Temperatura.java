package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double temperatura = teclado.nextDouble();
        teclado.nextLine();

        double temperaturaCelsius = (temperatura - AJUSTE) * FATOR;
        System.out.printf("A temperatura em Celsius é %.2f: ",temperaturaCelsius,"º");

        teclado.close();
    }
}
