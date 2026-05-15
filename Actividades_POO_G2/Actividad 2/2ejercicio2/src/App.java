import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("    PLANETA 1    ");

        System.out.print("Nombre: ");
        String nombre1 = scan.nextLine();

        System.out.print("Cantidad de satélites: ");
        int satelites1 = scan.nextInt();

        System.out.print("Masa: ");
        double masa1 = scan.nextDouble();

        System.out.print("Volumen: ");
        double volumen1 = scan.nextDouble();

        System.out.print("Diámetro: ");
        int diametro1 = scan.nextInt();

        System.out.print("Distancia al Sol: ");
        int distancia1 = scan.nextInt();

        scan.nextLine();

        System.out.println("Tipo de planeta:");
        System.out.println("1. GASEOSO");
        System.out.println("2. TERRESTRE");
        System.out.println("3. ENANO");

        int opcion1 = scan.nextInt();

        TipoPlaneta tipo1 = null;

        switch (opcion1) {

            case 1:
                tipo1 = TipoPlaneta.Gaseoso;
                break;

            case 2:
                tipo1 = TipoPlaneta.Terrestre;
                break;

            case 3:
                tipo1 = TipoPlaneta.Enano;
                break;
        }

        System.out.print("¿Es observable? (true/false): ");
        boolean observable1 = scan.nextBoolean();

        Planeta p1 = new Planeta(
                nombre1,
                satelites1,
                masa1,
                volumen1,
                diametro1,
                distancia1,
                tipo1,
                observable1
        );

        scan.nextLine();

        System.out.println("   PLANETA 2    ");

        System.out.print("Nombre: ");
        String nombre2 = scan.nextLine();

        System.out.print("Cantidad de satélites: ");
        int satelites2 = scan.nextInt();

        System.out.print("Masa: ");
        double masa2 = scan.nextDouble();

        System.out.print("Volumen: ");
        double volumen2 = scan.nextDouble();

        System.out.print("Diámetro: ");
        int diametro2 = scan.nextInt();

        System.out.print("Distancia al Sol: ");
        int distancia2 = scan.nextInt();

        scan.nextLine();

        System.out.println("Tipo de planeta:");
        System.out.println("1. GASEOSO");
        System.out.println("2. TERRESTRE");
        System.out.println("3. ENANO");

        int opcion2 = scan.nextInt();

        TipoPlaneta tipo2 = null;

        switch (opcion2) {

            case 1:
                tipo2 = TipoPlaneta.Gaseoso;
                break;

            case 2:
                tipo2 = TipoPlaneta.Terrestre;
                break;

            case 3:
                tipo2 = TipoPlaneta.Enano;
                break;
        }

        System.out.print("¿Es observable? (true/false): ");
        boolean observable2 = scan.nextBoolean();

        Planeta p2 = new Planeta(
                nombre2,
                satelites2,
                masa2,
                volumen2,
                diametro2,
                distancia2,
                tipo2,
                observable2
        );

        p1.imprimir();
        System.out.println("Densidad: " + p1.calcularDensidad());
        System.out.println("¿Es planeta exterior?: " + p1.esPlanetaExterior());

        p2.imprimir();
        System.out.println("Densidad: " + p2.calcularDensidad());
        System.out.println("¿Es planeta exterior?: " + p2.esPlanetaExterior());

        scan.close();
    }
}
