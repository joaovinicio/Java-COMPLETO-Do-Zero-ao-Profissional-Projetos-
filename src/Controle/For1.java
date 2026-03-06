package Controle;
/*
* ## 🔁 Estruturas de Repetição: Laço For

O `for` é uma estrutura de repetição compacta, ideal para situações onde sabemos exatamente o número de iterações.

#### **Destaques Técnicos:**
* **Sintaxe Limpa:** Agrupamento da inicialização (`int i = 0`), expressão lógica (`i <= 10`)
* e modificação da variável (`i++`) no cabeçalho do laço.
* **Escopo de Variável:** A variável de controle definida dentro do `for` fica restrita ao bloco do laço,
* liberando memória após a execução.
* **Flexibilidade:** Menos propenso a erros de "Loop Infinito" comparado ao `while`,
* já que o incremento é parte obrigatória da assinatura do laço.

#### **Curiosidade Técnica:**
O código contém um exemplo de **Loop Infinito** comentado (`for(;;)`).
* Essa é uma sintaxe válida no Java onde as três partes são omitidas, criando uma repetição perpétua,
* útil apenas em contextos muito específicos de monitoramento de processos.*/

public class For1 {
    public static void main(String[] args) {

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("Contador = %d%n", contador);
        }

        /*
         * Laçõ infinito
         *
         * for(;;){
         *   System.out.println("Fim");
         * }
         * */
    }
}
