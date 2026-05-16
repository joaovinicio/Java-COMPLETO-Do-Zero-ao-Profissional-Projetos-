package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        // Abre uma caixa de diálogo gráfica para capturar a entrada do usuário como String
        String num1 = JOptionPane.showInputDialog("Digite o primeiro Número: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo Número: ");

        // Aqui ocorre a concatenação (junção de textos), pois ainda são Strings
        System.out.println("Resultado concatenado: " + num1 + num2);

        // Conversão (Parsing): Transforma o texto em números do tipo double
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        // Operações matemáticas com os valores devidamente convertidos
        double soma = numero1 + numero2;
        double media = soma / 2;

        // Exibição formatada com duas casas decimais (%.2f)
        System.out.printf("A soma é: %.2f\n", soma);
        System.out.printf("A Média é: %.2f\n", media);
    }
}