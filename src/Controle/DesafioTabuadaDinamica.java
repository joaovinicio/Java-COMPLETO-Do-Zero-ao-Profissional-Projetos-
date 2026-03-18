package Controle;
/**
 * Desafio: Tabuada Dinâmica com exibição vertical.
 * * Estratégia: Utilização de laços aninhados para percorrer
 * multiplicando e multiplicador de 1 a 10.
 * * Formatação: Opção pelo uso de %n para garantir que cada
 * operação ocupe uma linha dedicada, priorizando a clareza visual no console.
 */
public class DesafioTabuadaDinamica {
    public static void main(String[] args) {

        for(int linha = 1; linha <=10; linha++){
            for(int coluna = 1; coluna <=10; coluna++){
                System.out.printf("%d x %d = %d %n", linha, coluna, linha * coluna);
            }
        }

    }
}
