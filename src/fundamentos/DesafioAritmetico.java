package fundamentos;

/**
 * DESAFIO: Algoritmo de Resolução de Expressão Aritmética Complexa.
 * * OBJETIVO:
 * Implementar em Java uma fórmula matemática que envolve múltiplas camadas de
 * precedência, frações e potências elevadas, garantindo a precisão do resultado final.
 * * COMPETÊNCIAS DESENVOLVIDAS:
 * 1. Precedência de Operadores: Organização rigorosa de parênteses para respeitar a ordem matemática.
 * 2. API Math: Utilização avançada do método estático Math.pow para exponenciação.
 * 3. Refatoração e Debugging: Identificação de erros de lógica e referências cruzadas de variáveis durante o desenvolvimento.
 * 4. Tipagem Primitiva: Uso de 'double' para manter a precisão decimal em divisões complexas.
 * * RESULTADO ESPERADO: 125.0
 */

public class DesafioAritmetico {
    public static void main(String[] args) {

        double colunaA = Math.pow(6 * (3 + 2) , 2);
        double denoA = 3 * 2;
        double resultadoA = colunaA / denoA;

        double colunaB = (1 -5) * (2 - 7);
        double denoB = 2;
        double resultadoB = Math.pow(colunaB / denoB, 2);

        double resultadoSuperior = Math.pow(resultadoA - resultadoB, 3);
        double inferior = Math.pow(10,3);

        double resultado = resultadoSuperior / inferior;
        System.out.println("O resultado é : "+resultado);

    }
}
