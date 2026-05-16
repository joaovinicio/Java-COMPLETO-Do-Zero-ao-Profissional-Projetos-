package fundamentos;

import java.util.Scanner;

/**
 * MÓDULO: Fundamentos do Java
 * DESAFIO DE CONVERSÃO (Resolvido com robustez):
 * 1. Entrada de Dados: Captura de múltiplas entradas de texto com Scanner.
 * 2. Higienização de Dados (Sanitization): Uso de .replace() encadeado para remover
 * pontos de milhar e converter vírgulas em pontos decimais, evitando NumberFormatException.
 * 3. Conversão de Tipos (Parsing): Transformação de Strings higienizadas em tipos numéricos (Double).
 */
public class DesafioConversao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo(a)!\n");

        // Funcionário 1
        System.out.println("Funcionário 1, digite seu nome: ");
        String nome1 = leitura.nextLine();
        System.out.println("Digite seu salário: ");
        // Remove pontos de milhar (ex: 2.500 -> 2500) e padroniza a vírgula para ponto decimal
        String salario1 = leitura.nextLine().replace(".", "").replace(",", ".");

        // Funcionário 2
        System.out.println("\nFuncionário 2, digite seu nome: ");
        String nome2 = leitura.nextLine();
        System.out.println("Digite seu salário: ");
        String salario2 = leitura.nextLine().replace(".", "").replace(",", ".");

        // Funcionário 3
        System.out.println("\nFuncionário 3, digite seu nome: ");
        String nome3 = leitura.nextLine();
        System.out.println("Digite seu salário: ");
        String salario3 = leitura.nextLine().replace(".", "").replace(",", ".");

        // Realizando o Parsing com segurança após a higienização das Strings
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        // Cálculos matemáticos
        double soma = valor1 + valor2 + valor3;
        double media = soma / 3;

        // Exibição formatada dos resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("A soma total dos salários é: %.2f%n", soma);
        System.out.printf("A média salarial entre %s, %s e %s é: %.2f%n", nome1, nome2, nome3, media);

        leitura.close();
    }
}