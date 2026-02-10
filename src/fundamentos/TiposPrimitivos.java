package fundamentos;

/**
 * Exercício: Tipos Primitivos e Variáveis
 * O que aprendi:
 * - O uso de sufixos (L, F, D) para definir literais de tipos específicos.
 * - Como o Java lida com números grandes e a importância de não ultrapassar os limites do 'int'.
 * - Configuração de cores no IntelliJ para identificar variáveis não utilizadas (estilo Eclipse).
 * - Diferença entre println (saída comum) e printf (saída formatada com %d e %.2f).
 */

public class TiposPrimitivos {
    public static void main(String[] args) {

        // tipos de números inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 456789;
        long numeroDePontosAcumulados = 3_134_845_223L;

        // Numeros reais com ponto flutuante

        float salario = 11_445_44F;
        double vendasAcumuladas = 2_991_797_103_01D;

        // tipo boolean
        boolean estaDeFerias = true;

        // tipo Caracter

        char ativo = 'S';

        System.out.println("Anos de Empresa : "+anosDeEmpresa * 365);
        System.out.println("numero de Vôos : "+numeroDeVoos /2);
        System.out.println("Pontos Acumulados : "+numeroDePontosAcumulados / vendasAcumuladas);
        System.out.printf("O id : %d %nGanha : %.2f %n" ,id ,salario);
        System.out.println("Esta de Ferias ? "+estaDeFerias);
        //System.out.println("Funcionario esta ativo na Empresa ? "+ativo);

    }
}
