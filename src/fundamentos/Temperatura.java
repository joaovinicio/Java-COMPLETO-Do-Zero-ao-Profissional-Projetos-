package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        final double ajuste = 32;
        final double formula = 5.0 / 9.0;

        System.out.println("Digite a Temperatura em Fahrenheit");
        double temperaturaFahrenheit = teclado.nextDouble();
        teclado.nextLine();

        double temperaturaCelsius = (temperaturaFahrenheit  - ajuste ) * formula ;
        System.out.printf("A temperatura em Celsius é %.2f: ",temperaturaCelsius);

        teclado.close();
    }
}
