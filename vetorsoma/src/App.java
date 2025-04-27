import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        int vetor[] = new int[10];
        int resultado = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite números: ");
            vetor[i] = scanner.nextInt();
            resultado += vetor[i];
        }

        System.out.println("A soma de todos os números digitados é: " + resultado);
        scanner.close();
    }
}
