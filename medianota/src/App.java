import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        int nota = 0;
        String permanecer;
        int aux = 0;
        double media = 0;

        do {
            System.out.print("Insira a nota: ");
            nota += scanner.nextInt();
            scanner.nextLine();

            System.out.println("Deseja continuar inserindo notas? (s - sim | n - não)   ");
            permanecer = scanner.nextLine();

            aux++;
        }while (!permanecer.equals("n"));

        media = nota / aux;
    
        System.out.println("A média de todas as notas dgitadas é: " + media);

     scanner.close();

    }
}
