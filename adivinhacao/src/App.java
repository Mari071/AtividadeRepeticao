import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        int tentativa = 0;
        int aux = 0;
        int aleatorio = random.nextInt(20) + 1;

        do {
            System.out.println("Advinhe o numero (ENTRE 1 A 20): ");
            tentativa = scanner.nextInt();
            aux++;

            if (tentativa > aleatorio){
                System.out.println("O número digitado é MAIOR que o número correto, chute mais BAIXO! ");               
            } else if (tentativa < aleatorio){
                System.out.println("O número digitado é MENOR que o número correto, chute mais ALTO! ");
            }
        }while(tentativa != aleatorio);

        System.out.println("Congratulations!!     Número de tentativas: " + aux);

        scanner.close();
    }
}
