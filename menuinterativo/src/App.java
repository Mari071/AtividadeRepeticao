import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int resUsu = 0;

        do {
            System.out.println("Escolha uma das opções  (1 - Adicionar | 2 - Remover | 3 - Sair)");
            resUsu = scanner.nextInt();

            if (resUsu == 1){
                System.out.println("Adicionado!");
        
            } if (resUsu == 2) {

                System.out.println("Removido!");
            }

        }while(resUsu == 1|| resUsu == 2);

        scanner.close();
    }
}
