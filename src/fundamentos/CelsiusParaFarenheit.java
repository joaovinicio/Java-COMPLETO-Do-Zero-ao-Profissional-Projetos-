package fundamentos;

/**
 * EXERCÍCIO: Conversão de Celsius para Fahrenheit.
 * - Objetivo: Demonstrar a aplicação da fórmula (C * 9/5) + 32.
 * - Aprendizado: Uso de variáveis de ponto flutuante (double) para manter precisão
 * e formatação de saída com printf.
 * - Resultado obtido: 145°C convertidos com sucesso para 293°F.
 */

public class CelsiusParaFarenheit {
    public static void main(String[] args) {

        double ajuste = 32;
        double fator = 9.0 / 5.0;
        double temperaturaCelsius = 43;

        double temperatura = (temperaturaCelsius * fator) + ajuste;
        System.out.printf("A temperatura de Celsius para Farenheit é : %.2f %s ",temperatura , "ºF");

    }
}
