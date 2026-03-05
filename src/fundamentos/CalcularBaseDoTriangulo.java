package fundamentos;

/*
* ## 📐 Estudo de Caso: Scanner e Manipulação de Buffer

Neste exercício de cálculo de área, explorei as diferenças sutis entre os métodos da classe `Scanner`.

#### **Aprendizados:**
* **next() vs nextLine():** Optei pelo `next()` para garantir a captura precisa do valor numérico
* antes de qualquer espaço em branco.
* **Tratamento de Localidade:** Ao converter manualmente com `Double.parseDouble(replace(",", "."))`,
* o programa tornou-se imune a erros de padrão regional (ponto vs vírgula).
* **Gerenciamento de Buffer:** Pratiquei a limpeza de buffer para evitar que caracteres residuais (`\n`)
* afetassem leituras subsequentes de dados.*/

import java.util.Locale;
import java.util.Scanner;

public class CalcularBaseDoTriangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo!");
        System.out.println("Digite seu nome! ");
        String nome = teclado.nextLine();
        System.out.println("Olá, sr(@) "+nome);

        System.out.println("Digite a altura do Triângulo: ");
        String entradaAltura = teclado.next();
        Double altura = Double.parseDouble(entradaAltura.replace(",","."));
        teclado.nextLine();

        System.out.println("Digite a base do Triângulo: ");
        String entradaBase = teclado.next();
        Double base = Double.parseDouble(entradaBase.replace(",","."));
        teclado.nextLine();

        double area = (base * altura) / 2;
        System.out.printf("À àrea do Triângulo é : %.2f",area);

        teclado.close();

    }
}
