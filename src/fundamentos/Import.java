package fundamentos;
/**
 * Exercício: Gerenciamento de Imports
 * O que aprendi:
 * - Organização Profissional: O comando Ctrl + Alt + O mantém o código limpo,
 * removendo referências desnecessárias que poluem o cabeçalho do arquivo.
 * - Conflitos de Nomes: Entendi que o import resolve ambiguidades, permitindo
 * que o Java saiba exatamente qual biblioteca usar (ex: java.util.Date).
 */
import javax.swing.*;
import java.util.Date;

public class Import {
    public static void main(String[] args) {

        String s = "Bom dia";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);
        JOptionPane botao = new JOptionPane();
        JOptionPane.showMessageDialog(botao, "Olá");

    }
}
