package fundamentos;
/*
* ## ⚖️ Exercício: Cálculo de IMC (Índice de Massa Corporal)

Este programa em Java solicita dados do usuário para calcular o IMC,
* demonstrando o uso de operadores aritméticos e a manipulação de entrada de dados via console.

#### **Funcionalidades:**
* Interação personalizada com o usuário (solicita o nome).
* Captura de dados numéricos do tipo `double` para peso e altura.
* Cálculo do IMC utilizando a fórmula: `peso / (altura * altura)`.
* Exibição do resultado formatado com duas casas decimais.

#### **Conceitos Técnicos Aplicados:**
* **Locale.US:** Configuração do Scanner para aceitar o padrão americano,
* onde o separador decimal é o ponto (.).
* **Limpeza de Buffer:** Uso de `leitura.nextLine()` após entradas numéricas
* para evitar erros em capturas de texto posteriores.
* **Saída Formatada:** Uso de `System.out.printf` para controlar a precisão das casas decimais.

#### **⚠️ Observação Importante:**
Devido à configuração `Locale.US`, o usuário deve inserir valores decimais utilizando
* **ponto** (ex: 79.8). O uso de vírgula resultará em erro de entrada (`InputMismatchException`).
* */

import java.util.Locale;
import java.util.Scanner;

public class LerNcm {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo");
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Olá, Sr(@) " + nome);

        System.out.println("Informe seu Peso");
        double peso = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Informe sua altura");
        double altura = leitura.nextDouble();
        leitura.nextLine();

        double imc = peso / (altura * altura);
        System.out.printf("Seu imc é : %.2f ", imc);

        leitura.close();

    }
}
