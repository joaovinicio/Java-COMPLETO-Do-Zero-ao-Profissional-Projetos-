package fundamentos;

import java.util.Locale;
import java.util.Scanner;

/**
 * MÓDULO: Fundamentos do Java
 * DESAFIO DE CONVERSÃO (Resolvido):
 * 1. Entrada de Dados: Uso do Scanner para capturar múltiplas entradas de texto.
 * 2. Normalização de Dados: Uso do .replace() para garantir que entradas com vírgula sejam aceitas.
 * 3. Conversão de Tipos (Parsing): Transformação de Strings em Double através da classe Wrapper.
 * 4. Localização: Configuração do Locale.US, embora o parse manual exija tratamento de String adicional.
 */
public class DesafioConversao {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Seja bem vindo!!");

        System.out.println("Funcionário 1 qual é o seu nome? ");
        String nome1 = leitura.nextLine();

        System.out.println("Digite seu salário ");
        String salario1 = leitura.nextLine().replace(",", ".");

        System.out.println("Funcionário 2 qual é o seu Nome? ");
        String nome2 = leitura.nextLine();

        System.out.println("Digite seu salário.");
        String salario2 = leitura.nextLine().replace(",", ".");

        System.out.println("Funcionário 3 qual é o seu Nome? ");
        String nome3 = leitura.nextLine();

        System.out.println("Digite seu salário.");
        String salario3 = leitura.nextLine().replace(",", ".");

        Double valor = Double.parseDouble(salario1);
        Double valor1 = Double.parseDouble(salario2);
        Double valor2 = Double.parseDouble(salario3);

        double soma = valor + valor1+ valor2;
        double media = soma / 3;

        System.out.printf("A soma salarial é: %.2f %n", soma);
        System.out.printf("A média salarial entre %s e %s é %s: %.2f %n", nome1, nome2, nome3, media);

        leitura.close();
    }
}