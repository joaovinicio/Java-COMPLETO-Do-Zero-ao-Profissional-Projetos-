package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // Expressão relacional que resulta em 'false'

        // Demonstração com variáveis
        System.out.println(condicao1 && condicao2);   // E (AND)
        System.out.println(condicao1 && !condicao2);  // E com Negação (NOT)
        System.out.println(condicao1 || condicao2);   // OU (OR)
        System.out.println(condicao1 ^ condicao2);    // OU Exclusivo (XOR)
        System.out.println(!condicao1);               // Inverte para false
        System.out.println(!condicao2);               // Inverte para true

        System.out.println("Tabela Verdade E &&");
        // O operador && só retorna TRUE se AMBOS os lados forem verdadeiros
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        System.out.println("Tabela Verdade Ou ||");
        // O operador || retorna TRUE se pelo menos UM dos lados for verdadeiro
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        System.out.println("Tabela Verdade Ou Exclusivo ^ (xor)");
        // O operador ^ só retorna TRUE se os lados forem DIFERENTES (um estritamente verdadeiro e outro falso)
        System.out.println(true ^ true);   // false (são iguais)
        System.out.println(true ^ false);  // true  (são diferentes)
        System.out.println(false ^ true);  // true  (são diferentes)
        System.out.println(false ^ false); // false (são iguais)
    }
}