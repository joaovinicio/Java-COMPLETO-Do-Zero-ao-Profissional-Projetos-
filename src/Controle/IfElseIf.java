package Controle;
/**
 * ## 📊 Classificador de Notas (Lógica de Controle)
 * <p>
 * Este projeto foca no uso de estruturas condicionais encadeadas para a categorização de dados numéricos em faixas de valores (Conceitos A a E).
 * <p>
 * #### **Destaques do Algoritmo:**
 * **Validação de Fronteira:** O código descarta imediatamente entradas fora do intervalo permitido [0, 10].
 * **Eficiência de Fluxo:** Utilização de `else if` para garantir que apenas uma condição seja validada, otimizando a execução.
 * **Hierarquia Lógica:** Organização das condições em ordem decrescente para garantir a correta atribuição dos conceitos.
 * <p>
 * #### **Conceitos Aplicados:**
 * **Operadores Lógicos:** Uso do operador `||` (OR) para validação composta.
 * **Entrada de Dados:** Manipulação do `Scanner` para leitura de tipos `double` e limpeza de buffer.
 */

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = leitura.nextDouble();
        leitura.nextLine();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Inválida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
        leitura.close();
    }
}
