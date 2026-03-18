package Controle;
/**
 * Estudo de Laços Aninhados (Nested Loops) em Java.
 * * Objetivo: Demonstrar a variação de comportamento dos laços 'for'
 * através da inversão de operadores de comparação e incremento/decremento.
 * * Estruturas exploradas:
 * 1. Matriz Decrescente: Utiliza decremento (--) e limite inferior (>=).
 * 2. Matriz Crescente: Utiliza incremento (++) e limite superior (<=).
 */
public class For3 {
    public static void main(String[] args) {

        for(int i2 =10; i2 >=0; i2--){
            for(int j2 =10; j2>= 0; j2--){
                System.out.printf("[%d %d]",i2,j2);
            }
            System.out.println();
        }

        System.out.println();

        for (int calculo = 0; calculo <=10; calculo++) {
            for (int gata = 0; gata <=10; gata++){
                System.out.printf("[%d %d]",calculo,gata);
            }
            System.out.println();
        }
    }
}
