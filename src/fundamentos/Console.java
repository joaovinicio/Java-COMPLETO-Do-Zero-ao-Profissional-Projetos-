package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        /**
         * MÓDULO: Fundamentos do Java
         * CONCEITOS APRENDIDOS:
         * 1. Entrada de Dados: Uso da classe Scanner para ler dados do teclado.
         * 2. Internacionalização (Locale): Configuração do padrão americano (US) para aceitar ponto em números decimais.
         * 3. Formatação Complexa: Uso do printf para misturar múltiplos valores inteiros e Strings em uma única linha.
         * 4. Limpeza de Buffer: Tratamento do "bug" do Scanner ao ler números seguidos de textos.
         */

        System.out.println("Bom");
        System.out.printf("Mega Sena : %d %d %d %d %d %d %s ",1,2,3,4,5,6, ": Não Foi dessa Vez");
        System.out.printf("%nSalário : %.4f %n", 1234.5678);

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Nome: "+nome);

        System.out.println("Informe seu Salário: ");
        double salarioDoJV =  leitura.nextDouble();
        leitura.nextLine();
        System.out.println("Salário: "+salarioDoJV);

        leitura.close();
    }
}
