public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        int sequencia = 0;
        int aux = 0;

        num1 = 0;
        num2 = 1;

        while (aux != 10) {
            System.out.println(sequencia);
            sequencia = num1 + num2;
            num1 = num1 + num2;
            num2 = sequencia - num2;
            aux++;           
        }
    }
        
}
