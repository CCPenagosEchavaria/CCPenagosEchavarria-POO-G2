import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        int edjuan = scan.nextInt();
        familia familia = new familia (edjuan);
        familia.edades();
        scan.close();
    }
}
