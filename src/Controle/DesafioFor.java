package Controle;
/**
 * Exercício: Construção de Estrutura de Repetição (Escada de Caracteres).
 * * Abordagens exploradas:
 * 1. Controle por Variável Primitiva (int): O laço é ditado por um contador
 * numérico tradicional, enquanto a String é concatenada no corpo do loop.
 * 2. Controle por Objeto (String): O próprio estado da String (tamanho e conteúdo)
 * serve como condição de parada, utilizando concatenação e comparação
 * de igualdade (equalsIgnoreCase) como critério de fluxo.
 */
public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for(int i = 1; i <=5; i++){
            System.out.println(valor);
            valor +="#";
        }

        for(String valor2 = "*"; !valor2.equalsIgnoreCase("******"); valor2 +="*" ){
            System.out.println(valor2);
        }
    }
}
