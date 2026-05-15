import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double radio=scan.nextDouble();
        Circulo figura1=new Circulo(radio);

        System.out.println("Ingrese la base del rectángulo: ");
        int baser=scan.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        int alturar=scan.nextInt();
        Rectangulo figura2=new Rectangulo(baser, alturar);

        System.out.println("Ingrese el lado del cuadrado: ");
        int lado=scan.nextInt();
        Cuadrado figura3=new Cuadrado(lado);

        System.out.println("Ingrese la base del triángulo: ");
        int baset=scan.nextInt();
        System.out.println("Ingrese la altura del triángulo: ");
        int alturat=scan.nextInt();
        Triangulo figura4=new Triangulo(baset, alturat);

        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();

        scan.close();
    }
}
