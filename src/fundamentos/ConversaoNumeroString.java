package fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        // Exemplo 1: Convertendo a partir de um Objeto Wrapper (Integer)
        Integer num1 = 1090;
        // Como 'num1' é um objeto, ele possui o método .toString() direto dele
        System.out.println(num1.toString().length()); // Transforma em texto e conta os caracteres

        // Exemplo 2: Convertendo a partir de um tipo Primitivo (int)
        int num2 = 100;
        // Primitivos não têm métodos. Usamos a classe Integer para fazer a conversão
        System.out.println(Integer.toString(num2).length());

        // Exemplo 3: Outra forma muito comum no dia a dia (Concatenação)
        System.out.println(("" + num2).length());
    }
}