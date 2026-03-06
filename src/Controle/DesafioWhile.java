package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String palavraMagica = "";

        while (!palavraMagica.equalsIgnoreCase("sair")){
            System.out.println("Digite à Palavra Mágica!");
            palavraMagica = leitura.nextLine();

            if (!palavraMagica.equalsIgnoreCase("sair")){
                System.out.println("Você errou! Tente Novamente..");
            }else {
                System.out.println("Você acertou.");
            }
        }
            System.out.println("Fim!!");
            leitura.close();
    }
}
