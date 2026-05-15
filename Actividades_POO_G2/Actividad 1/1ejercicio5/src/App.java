import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite el radio del círculo: ");
        double radio = scan.nextDouble();
        circulo c = new circulo(radio);
        c.mostrarResultados();
        scan.close();
    }
}