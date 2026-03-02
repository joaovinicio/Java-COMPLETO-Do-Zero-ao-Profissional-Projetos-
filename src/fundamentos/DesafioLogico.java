package fundamentos;

/**
 * MÓDULO: Fundamentos do Java
 * EXERCÍCIO: Simulação de Lógica de Decisão (Desafio da TV e Sorvete).
 * * OBJETIVO:
 * Aplicar operadores lógicos para resolver um problema baseado em condições independentes
 * (trabalho na terça e/ou quinta-feira) e suas consequências financeiras e de saúde.
 * * CONCEITOS APLICADOS:
 * 1. Operadores Lógicos Binários: Uso de '&&' (E) para sucesso em ambos os dias e '||' (OU) para sucesso em pelo menos um dia.
 * 2. Operador Lógico Unário: Uso de '!' (NÃO) para representar a negação da condição de tomar sorvete (ser saudável).
 * 3. Estruturas de Controle: Implementação de 'if/else if/else' para direcionar o fluxo baseado nos resultados lógicos.
 * 4. Operador Ternário: Utilização de expressão condicional compacta para definir o status da saúde como String.
 * 5. Tratamento de Strings: Uso de 'equalsIgnoreCase' para tornar a entrada do usuário resiliente a variações de caixa.
 * * RESULTADO: O programa demonstra como decisões complexas podem ser decompostas em álgebra booleana simples.
 */

import java.util.Locale;
import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Seja bem Vindo!!!");
        System.out.println("Digite seu Nome :");
        String nome = leitura.nextLine();
        System.out.println("Olá Sr(@) : "+nome);

        System.out.println("Você foi ao Trabalho na Terça- Feira? (sim/não)");
        String tv50Polegadas = leitura.nextLine();

        System.out.println("Você foi ao Trabalho na Quinta- Feira? (sim/não)");
        String tv32Polegadas = leitura.nextLine();

        Boolean trabalhouTerca = tv50Polegadas.equalsIgnoreCase("sim");
        Boolean trabalhouQuinta = tv32Polegadas.equalsIgnoreCase("sim");

        boolean sorvete = trabalhouTerca || trabalhouQuinta;

        if(trabalhouTerca && trabalhouQuinta){
            System.out.println("Você trabalhou 2 dias da Semana terá dinheiro para" +
                    " Comprar a tv que quiser é tomará Sorvete "+sorvete);
        } else if (trabalhouTerca || trabalhouQuinta ) {
            System.out.println("Você trabalhou 1 dia da Semana! Terá dinheiro para" +
                    " Comprar a tv32 polegadas é tomará Sorvete "+sorvete);
        }else {
            System.out.println("Você não trabalhou! Sem grana para Tv é também não " +
                    "tomará sorvete !"+sorvete);
        }

        boolean maisSaudavel = !sorvete;
        String statusDaSaude = maisSaudavel ? "Sim" : "Não";
        System.out.println("Ficou mais Saúdavel? "+statusDaSaude);

        leitura.close();

    }
}
