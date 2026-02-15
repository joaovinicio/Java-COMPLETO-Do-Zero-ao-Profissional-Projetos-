package fundamentos;

import java.util.Scanner;

/**
 * MÓDULO: Fundamentos do Java
 * CONCEITOS APRENDIDOS:
 * 1. Wrappers: Uso das classes que envolvem tipos primitivos (Byte, Short, Integer, Long, Boolean, Character, Float, Double).
 * 2. Conversão (Parsing): Transformação de Strings em tipos numéricos e booleanos usando métodos estáticos.
 * 3. Manipulação de Objetos: Uso de métodos como .toString(), .toUpperCase() e .byteValue() em tipos que seriam primitivos.
 * 4. Autoboxing: Atribuição direta de valores literais a classes Wrapper.
 */

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entrada.nextLine());
        Long l = Long.parseLong("100500");
        Boolean bo = Boolean.parseBoolean("true");
        Character c = '#';
        Float f = 123.0F;
        Double d = 1234.5678;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i - 2);
        System.out.println(l);
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        System.out.println(c.toString().concat(";D"));
        System.out.println(f);
        System.out.println(d);

        entrada.close();

    }
}
