package Controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        // Definimos a faixa inicial do aluno (neste caso, "branco")
        String faixa = "branco";

        /*
         * O switch sem o break executa o case correspondente E TODOS OS SEGUINTES
         * em cascata (efeito dominó), até encontrar o final da estrutura ou um break.
         * Como a faixa é "branco", ela não entra nos cases específicos de cima
         * e cai direto no default.
         */
        switch (faixa){

            case "preta":
                System.out.println("Sabe o Baissai-Dai....");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sabe o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sabe o Heian Nidan");
            case "amarela":
                System.out.println("Sabe o Heian Shodan");
            default:
                // Como nenhuma das faixas acima corresponde a "branco",
                // o programa executa esta linha e encerra o switch.
                System.out.println("Não sei de Nada..kkkkk");
        }
    }
}