package Controle;
/**
 * Exemplo de estrutura de repetição 'while' com condição indeterminada.
 * O laço permanece ativo até que o usuário digite a palavra-chave de saída.
 */
import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String valor = "";

            while (!valor.equalsIgnoreCase("sair")){
                System.out.println("Você diz? ");
                valor = leitura.nextLine();

            }
        leitura.close();
    }
}
