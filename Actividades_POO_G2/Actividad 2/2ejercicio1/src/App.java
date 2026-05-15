import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("    PERSONA 1   ");

        System.out.print("Ingrese el nombre: ");
        String nombre1 = scan.nextLine();

        System.out.print("Ingrese los apellidos: ");
        String apellidos1 = scan.nextLine();

        System.out.print("Ingrese el número de documento: ");
        String documento1 = scan.nextLine();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio1 = scan.nextInt();
        scan.nextLine();

        Persona p1 = new Persona(nombre1, apellidos1, documento1, anio1);

        System.out.println("    PERSONA 2    ");

        System.out.print("Ingrese el nombre: ");
        String nombre2 = scan.nextLine();

        System.out.print("Ingrese los apellidos: ");
        String apellidos2 = scan.nextLine();

        System.out.print("Ingrese el número de documento: ");
        String documento2 = scan.nextLine();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio2 = scan.nextInt();

        Persona p2 = new Persona(nombre2, apellidos2, documento2, anio2);

        p1.imprimir();
        p2.imprimir();

        scan.close();
    }
}
