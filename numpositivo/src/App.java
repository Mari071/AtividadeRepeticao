import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int num = 0;
        int soma = 0;

        Scanner scanner = new Scanner (System.in);

         while(num >= 0){
            System.out.println("Escreva um número: ");
            num = scanner.nextInt();

            soma = soma + num; 
            
            if (num < 0){
                break;
            }
         }

    System.out.println("O resultado de todos os números digitados é: " + soma);

     scanner.close();

    }
}
