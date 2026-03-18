package Controle;
/**
 * Objetivo: Compreender a flexibilidade da sintaxe do Java e o impacto do escopo de variáveis.
 * Modelo 1 (Compacto): Segue as melhores práticas de legibilidade e encapsulamento de variável.
 * Modelo 2 (Global): Demonstra como manter o valor da variável de controle acessível após o encerramento do laço.
 * Modelo 3 (Desestruturado): Explora a omissão da seção de incremento/decremento no cabeçalho do for,
 * transferindo a responsabilidade para o corpo do laço.
 * */
public class For2 {
    public static void main(String[] args) {

        /**
         * Desafio criar um laço for Decrescente de 2 em 2*/

        for(int contador =10; contador >=0; contador -=2 ){
            System.out.printf("Contador : %d %n",contador);
        }
        System.out.println("");
        int conta;
        for(conta =10; conta >=0; ){
            System.out.printf("Conta : %d %n",conta);
            conta -=2;
        }
        System.out.println("");
        for(int conta2 =12; conta2>=0; ){
            System.out.printf("Conta 2: %d %n",conta2);
            conta2 -=2;
        }

    }
}
