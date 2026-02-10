package fundamentos;

/**
 * Exercício: Notação Ponto e a Natureza das Strings
 * O que aprendi:
 * * - Strings são Objetos: Diferente dos tipos primitivos (int, double), Strings são classes
 * que oferecem uma "caixa de ferramentas" via Notação Ponto.
 * * - Manipulação Dinâmica: Pratiquei o uso de .replace(), .toUpperCase() e .concat()
 * para transformar textos em tempo de execução.
 * * - A Importância do .length(): Embora pareça óbvio em textos fixos, entendi que este método
 * é vital para automação e segurança, como validar se uma senha tem o tamanho mínimo
 * exigido ou se um CPF possui 11 dígitos.
 * * - Senso Crítico e Praticidade: Notei que para tarefas simples, o operador '+' é mais
 * produtivo que o .concat(), mas a Notação Ponto é o que permite ao Java "medir" e
 * processar dados que o programador não conhece de antemão.
 */

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        System.out.println(a);

        String s = "Bom dia X";
        System.out.println(s);

        s = s.replace("X","Senhor");
        s = s.toUpperCase();
        System.out.println(s);

        s = s.concat("!!");
        System.out.println(s);

        System.out.println("Olá João".toUpperCase().concat("!!"));

        String y = "Bom dia X".replace("X", "João");
        System.out.println(y.length());



    }
}
