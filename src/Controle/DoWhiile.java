package Controle;
/**
 * - Implementado laço do-while para garantir ao menos uma execução do bloco de código.
 * - Utilizado o método equalsIgnoreCase para validação de entrada de texto independente de maiúsculas/minúsculas.
 * - Adicionado controle de fluxo baseado em sentinela (palavra mágica) para encerramento do programa.*/

import java.util.Scanner;

public class DoWhiile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Para Sair você Precisa digitar as palavras Mágicas..");
            texto = leitura.nextLine();

        }   while (!texto.equalsIgnoreCase("Por Favor"));
            System.out.println("Obrigado por Utilizar nosso Programa!");

        leitura.close();
    }
}
