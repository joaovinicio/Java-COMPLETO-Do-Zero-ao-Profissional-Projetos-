package fundamentos;

/*
* #### **Destaques Técnicos:**
* **Fórmula de Delta:** Implementação precisa de $\Delta = b^2 - 4ac$.
* **Raízes Reais:** Uso de `Math.sqrt()` e `Math.pow()` para cálculos de alta precisão.
* **Lógica de Proteção:** O programa identifica quando o Delta é negativo e
* informa ao usuário que não existem raízes reais, evitando erros de execução.
* **Formatação:** Saída de dados utilizando `printf` com duas casas decimais e quebras de linha universais (`%n`).

#### **Como rodar:**
Certifique-se de inserir os valores decimais utilizando **ponto** (ex: 1.0), devido à configuração de `Locale.US`.
* */
import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor de A");
        double a = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite o valor de B");
        double b = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite o valor de C");
        double c = teclado.nextDouble();
        teclado.nextLine();

        double delta = Math.pow(b,2) - (4 * a * c);
        System.out.printf("O valor de Delta é : %.2f%n ",delta);

        if (delta < 0){
            System.out.println("O Delta é negativo, portanto a equação não possui raízes reais.");
        }
            else {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("O valor de x1 é : %.2f%n",x1);
            System.out.printf("O valor de x2 é : %.2f%n",x2);
        }

        teclado.close();


    }
}
