package fundamentos;

/**
 * MÓDULO: Fundamentos do Java
 * EXERCÍCIO: Desafio da Calculadora (Lógica Condicional Sem Estruturas de Controle Tradicionais).
 * * OBJETIVO:
 * Criar uma calculadora funcional que realize as 5 operações aritméticas básicas (+, -, *, /, %)
 * utilizando exclusivamente operadores ternários para a lógica de decisão.
 * * CONCEITOS APLICADOS:
 * 1. Operador Ternário Encadeado: Substituição de estruturas 'if-else' por expressões condicionais aninhadas.
 * 2. Manipulação de Buffer: Uso estratégico de 'leitura.nextLine()' para limpar o scanner após entradas numéricas.
 * 3. Operadores Aritméticos: Implementação de soma, subtração, multiplicação, divisão e módulo.
 * 4. Comparação de Strings: Uso de 'equalsIgnoreCase' para validação segura do símbolo da operação.
 * 5. Formatação de Saída: Uso de 'printf' para exibição do resultado com precisão de duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = leitura.nextLine();
        System.out.println("Olá, seja bem Vindo(@) "+ nome);

        System.out.println("Digite um valor para calcular-mos");
        Double valor1 = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Qual operação deseja fazer? (+ - * / %)");
        String operacao = leitura.nextLine();

        System.out.println("Informe outro valor");
        Double valor2 = leitura.nextDouble();
        leitura.nextLine();

        double resultado = "+".equalsIgnoreCase(operacao)? valor1 + valor2 :
                "-".equalsIgnoreCase(operacao)? valor1 - valor2 :
                "*".equalsIgnoreCase(operacao)? valor1 * valor2 :
                "/".equalsIgnoreCase(operacao)? valor1 / valor2 :
                "%".equalsIgnoreCase(operacao)? valor1 % valor2 : 0;

        System.out.printf("Resultado é %.2f : ",resultado);
        leitura.close();

    }
}
