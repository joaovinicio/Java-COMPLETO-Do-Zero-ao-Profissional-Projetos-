package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
           double raio = 3.4;
           final double pi = 3.15159;

           double area = pi * raio * raio;
           System.out.printf("Resultado = %.2f",area);

           raio = 10;
           area = pi * raio * raio;
           System.out.printf("%narea = %.2f",area);
    }
}
