package fundamentos;

public class TipoString {
    public static void main(String[] args) {

        /**
         * MÓDULO: Fundamentos do Java
         * CONCEITOS APRENDIDOS:
         * 1. Strings como Objetos: Uso da notação ponto para métodos como charAt, toUpperCase e startsWith.
         * 2. Imutabilidade: Compreensão de que Strings não mudam; é necessário reatribuir o valor.
         * 3. Inferência de Tipo: Uso do 'var' para deixar o compilador identificar o tipo da variável.
         * 4. Formatação de Dados: Uso do printf com máscaras (%f, %d) e manipulação de separadores decimais.
         * 5. Comparação de Textos: Diferença entre equals e equalsIgnoreCase.
         */

        System.out.println("texto qualquer".charAt(3));
        String s = "texto";
        s = s.toUpperCase();
        System.out.println(s);

        s = s.concat("!!");
        System.out.println(s);

        String nome = "João Vinicio";
        System.out.println(nome);
        System.out.println(s.startsWith("texto!!"));
        System.out.println(s.startsWith("TEXTO!!"));
        System.out.println(s.length());

         var nome1 = "Pedro";
         var sobrenome = "Henrique";
         var idade = 32;
         var salario = 2.100;

        System.out.println(nome1+sobrenome);
        System.out.println(nome1.equalsIgnoreCase("PEDRO"));
        System.out.printf("Salário = %.3f%n ".replace(",", "."),salario);
        System.out.printf("Idade : %d ",idade);

    }
}
