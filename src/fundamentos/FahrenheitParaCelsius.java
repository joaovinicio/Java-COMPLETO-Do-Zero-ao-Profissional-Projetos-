package fundamentos;

/**
 * MÓDULO: Fundamentos do Java
 * EXERCÍCIO: Conversão Térmica (Fahrenheit para Celsius).
 * * OBJETIVO:
 * Demonstrar o uso de constantes de ajuste e fatores de conversão em expressões aritméticas.
 * * COMPETÊNCIAS:
 * 1. Precedência de Operadores: Garantia de que a subtração ocorra antes da multiplicação via parênteses.
 * 2. Ponto Flutuante: Uso de literais double (5.0/9.0) para evitar o truncamento da divisão inteira.
 * 3. Saída de Dados: Formatação de String com printf para exibição de unidades de medida (ºC).
 */

public class FahrenheitParaCelsius {
    public static void main(String[] args) {

        double fator = 5.0 / 9.0;
        double TemperaturaFahrenheit = 86;
        double ajuste = 32;

        double temperatura = (TemperaturaFahrenheit - ajuste) * fator;
        System.out.printf("A temperatura em Celius é : %.2f %s ",temperatura,"ºC");

    }
}
