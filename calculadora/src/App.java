import java.util.Scanner;

public class App {
   
    // função montante simples
    static double monS (double invesI, double jurosA, double invesP){

        double montanteS;

        montanteS = invesI * (1 + jurosA / 100 * invesP);
        
        return montanteS;
    }

    // função montante composto
    static double monC (double invesI, double jurosA, double invesP){

        double montanteC;

        montanteC = invesI * Math.pow(1 + jurosA / 100, invesP);

        return montanteC;
    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        // declaração de variáveis
        double invesI;
        double jurosA;
        double invesP;
        String cap;
        double montanteS = 0;
        double montanteC = 0;
        String repetir;


        // entrada do usuário
        do {
            System.out.print("Digite o valor do investimento inicial: ");
            invesI = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual: ");
            jurosA = scanner.nextDouble();
           
            System.out.print("Digite o tempo do investimento (em anos): ");
            invesP = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite a capitalização de seu interesse (simples ou composto): ");
            cap = scanner.nextLine();

            if (cap.equalsIgnoreCase("simples")){

                System.out.println(monS(invesI, jurosA, invesP));
            } else if (cap.equalsIgnoreCase("composto")){

                System.out.println(monC(invesI, jurosA, invesP));
            } else {
                System.out.println("SIMPLES OU COMPOSTO!");
            }

            System.out.println("Deseja realizar um novo cálculo? (s - SIM | n - NÃO)");
            repetir = scanner.nextLine();
                
            }while(!repetir.equals("n"));

            scanner.close();

        }
    }

