package fundamentos;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor para elevar-mos ao quadrado é ao cubo");
        double valor = leitura.nextDouble();
        leitura.nextLine();
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);
        System.out.printf("Valor ao Quadrado: %.2f %nValor ao Cubo: %.2f", quadrado,cubo);

        leitura.close();
    }
}
