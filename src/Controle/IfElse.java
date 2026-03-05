package Controle;
/*
* ## 🖥️ Interface Gráfica com Swing (Evolução)

Nesta etapa, implementei a saída de dados totalmente visual, eliminando a dependência
* do console para exibir os resultados ao usuário.

#### **Principais aprendizados:**
* **UX (User Experience):** Entendi que manter o padrão de comunicação (se a entrada é por janela,
* a saída também deve ser) melhora a experiência de quem usa o software.
* **Interatividade:** Uso do componente `showMessageDialog` para exibir alertas informativos.
* **Lógica de Controle:** Mantive a verificação de paridade via operador de módulo `%`,
* integrada agora à interface gráfica.
* */

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um número");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null,"Número Par");
        }else {
            JOptionPane.showMessageDialog(null,"Número Impar");
        }
    }
}
