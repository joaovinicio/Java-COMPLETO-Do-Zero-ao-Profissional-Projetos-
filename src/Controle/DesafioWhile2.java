package Controle;
/**
 * - Adicionado suporte para entrada de notas com vírgula ou ponto.
 * - Implementada validação para aceitar apenas notas entre 0 e 10.
 * - Corrigido escopo das variáveis e estrutura do loop de repetição.
 * - Adicionada lógica de status (Aprovado, Recuperação ou Reprovado) após o encerramento da coleta.
 * - Tratamento de entradas vazias para evitar exceções no sistema.
 *
 * */
import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        double nota = 0;
        double totalDeNotas = 0;
        int quantidadeDeNotas = 0;

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.printf("Seja bem vindo Sr@ : %s%n", nome);

        while (nota != -1) {
            System.out.println("Digite uma nota! ou -1 Para Sair");
            String entrada = leitor.nextLine().replace(",", ".");;

            if (!entrada.isBlank()) {
                nota = Double.parseDouble(entrada);

                if( nota == -1){
                    break;
                }
                if (nota >= 0 && nota <= 10) {
                    totalDeNotas += nota;
                    quantidadeDeNotas++;
                }
                else  {
                    System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                }
            }
        }

        if (quantidadeDeNotas > 0) {
            double media = totalDeNotas / quantidadeDeNotas;
            System.out.printf("À Média é : %.2f %n", media);

            if (media >= 7.0) {
                System.out.println("Parabéns você foi Aprovado!");
            } else if (media >= 5.0) {
                System.out.println("Você esta em Recuperação!");
            } else {
                System.out.println("Você foi Reprovado!!");
            }
        }
        System.out.println("Obrigado por utilizar nosso Programa!!");
        leitor.close();
    }

}
