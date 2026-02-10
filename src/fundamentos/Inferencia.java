package fundamentos;

/**
 * Exercício: Inferência de Tipos
 * O que aprendi:
 * - O Java pode deduzir o tipo da variável usando a palavra reservada 'var' (disponível desde o Java 10).
 * - Uma vez que o tipo é inferido, ele não pode ser alterado (o Java continua sendo estaticamente tipado).
 * - A inferência ajuda a deixar o código menos verboso, mas deve ser usada com sabedoria para manter a legibilidade.
 * - Variáveis criadas com 'var' devem ser inicializadas obrigatoriamente na mesma linha.
 */

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "outro Texto";
        System.out.println(c);

    }
}
