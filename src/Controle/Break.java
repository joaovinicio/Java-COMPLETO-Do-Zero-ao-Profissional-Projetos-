package Controle;

public class Break {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++ ){
            // O break interrompe totalmente o laço de repetição quando i chega a 5
            if(i ==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim!!");
    }
}