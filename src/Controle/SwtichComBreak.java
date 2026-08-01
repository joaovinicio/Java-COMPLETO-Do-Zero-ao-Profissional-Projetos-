package Controle;

import java.util.Scanner;

public class SwtichComBreak {
    public static void main(String[] args) {

        // Inicializa o Scanner para ler a entrada do usuário pelo console
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Digite um numero inteiro");
        int nota = entrada.nextInt();

        // O switch avalia a nota informada pelo usuário
        switch (nota) {

            // Cases agrupados: notas 10 e 9 compartilham o mesmo bloco de código
            case 10:
            case 9:
                conceito = "A";
                break; // O break interrompe a execução para não cair nos próximos cases
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;

            // O default é executado caso nenhuma das opções anteriores seja atendida
            default:
                conceito = "Não informado";
        }

        // Exibe o resultado final com base no conceito atribuído
        System.out.println("Conceito é : " + conceito);

        // Fecha o Scanner para liberar recursos do sistema
        entrada.close();
    }
}