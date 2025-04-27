public class App {
    public static void main(String[] args) throws Exception {

        int num = 1;
        int resultado = 0;

        for (int i = 1; i <= 10; i++){
            resultado = 5 * num;
            num = num + 1;
            System.out.println("5 x " + i + " = " + resultado);
        }
    }
}
