package Controle;
/*
* ## 🔁 Estruturas de Repetição: While Determinado

Neste exercício, explorei o funcionamento do laço `while` para execuções controladas por uma variável contadora.

#### **Aprendizados Técnicos:**
* **Controle de Fluxo:** O bloco de código é executado repetidamente enquanto a condição for verdadeira (`true`).
* **Gerenciamento de Variáveis:** Pratiquei a inicialização, teste e o incremento (através do operador unário `++`).
* **Prevenção de Erros:** Entendi a importância do incremento para evitar o "Loop Infinito", situação onde a condição nunca se torna falsa.
* **Saída Formatada:** Uso do `%d` para injetar valores inteiros de forma organizada no console.*/

public class WhileDeterminado{
    public static void main(String[] args) {

        int contador = 1;
        while (contador <=10){
            System.out.printf("Contador = %d%n",contador);
            contador++;
        }
    }
}
