import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite un número entero: ");
        int num = scan.nextInt();
        numero n = new numero(num);
        n.mostrarResultados();
        scan.close();
    }
}