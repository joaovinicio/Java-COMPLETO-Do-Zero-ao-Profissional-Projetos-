package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        // CURIOSIDADE COMPILAÇÃO: O Java armazena caracteres usando números da tabela Unicode/ASCII.
        // O caractere 'a' minúsculo equivale exatamente ao número 97.
        int a = 97;
        int b = 'a';

        // Operadores Relacionais Básicos (O resultado é sempre true ou false)
        System.out.println(a == b);  // Igualdade: true (97 é igual ao valor numérico de 'a')
        System.out.println(3 > 4);   // Maior que: false
        System.out.println(3 >= 3);  // Maior ou igual a: true
        System.out.println(3 < 7);   // Menor que: true
        System.out.println(30 <= 7); // Menor ou igual a: false
        System.out.println(30 != 7); // Diferente de: true

        // Aplicação prática em uma regra de negócio (Combinação com Operadores Lógicos)
        double nota = 9.3;
        boolean bomComportamento = true;

        // Atribuindo o resultado de uma expressão relacional a uma variável booleana
        boolean passouPorMedia = nota >= 7;

        // O desconto só é aplicado se AMBAS as condições forem verdadeiras (E lógico)
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem Desconto? " + temDesconto); // true
    }
}