import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        
        //
        int numU = 0;
        int resultado = 1;

        System.out.println("Digite um número (positivo): ");
        numU = scanner.nextInt();

        if (numU < 0){
            System.out.println("Um número POSITIVO!");
        } else {
            for (int i = 1; i <= numU; i++){
                resultado *= i;
            }
            
            System.out.println("Fatorial do número digitado = " + resultado);
        }

        scanner.close();
    }
}
