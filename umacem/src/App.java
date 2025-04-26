import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int numUsuario = 0;

        do {
            System.out.print("Digite um numero que esteja entre 1 a 100: ");
            numUsuario = scanner.nextInt();

        }while (numUsuario < 1 || numUsuario > 100);

        scanner.close();

    }
}
