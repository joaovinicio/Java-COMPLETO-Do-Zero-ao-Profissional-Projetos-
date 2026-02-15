package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        /**
         * MÓDULO: Fundamentos do Java
         * CONCEITOS APRENDIDOS:
         * 1. Tipos Primitivos: Armazenam valores puros e ocupam menos espaço na memória.
         * 2. Objetos: Instâncias de classes que possuem atributos (dados) e comportamentos (métodos).
         * 3. Notação Ponto: Capacidade de acessar funcionalidades apenas em objetos.
         * 4. Wrappers: Entendimento de que para cada primitivo existe uma classe correspondente (ex: int -> Integer).
         * 5. Paradigma da Linguagem: "Tudo em Java é objeto, exceto os 8 tipos primitivos".
         */

        String s = new String("texto");
        s = s.toUpperCase();
        System.out.println(s);

        int a = 123;
        System.out.println(a);

    }
}
