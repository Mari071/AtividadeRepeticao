import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int senha = 1313;
        int respostaUsuario = 0;
        
        System.out.println("Digite a senha: ");
        respostaUsuario = scanner.nextInt();


        while (respostaUsuario != senha){
                System.out.println("SENHA INCORRETA, tente novamente: ");
                respostaUsuario = scanner.nextInt();

        }
        
        System.out.println("SENHA CORRETA! Pode prosseguir.");
        scanner.close();
                
    }

    
}


