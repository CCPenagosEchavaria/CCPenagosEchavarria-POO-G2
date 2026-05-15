import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    System.out.println("    INGRESA LOS DATOS DE TU AUTOMÓVIL    ");

    System.out.println("Marca: ");
    String marca = scan.nextLine();

    System.out.println("Modelo: ");
    int modelo = scan.nextInt();

    System.out.println("Cilindraje: ");
    int cilindraje = scan.nextInt();

    System.out.println("Tipo de combustible: (elige un número) ");
    System.out.println("1) Diesel");
    System.out.println("2) Bioetanol");
    System.out.println("3) Gasolina");
    System.out.println("4) Biodiesel");
    System.out.println("5) Gas_natural");
    int opcionComb = scan.nextInt();
    tipoCom tipoCombustible;
    switch (opcionComb) {
        case 1:
        tipoCombustible = tipoCom.Diesel;
        break;
        case 2:
        tipoCombustible = tipoCom.Bioetanol;
        break;
        case 3:
        tipoCombustible = tipoCom.Gasolina;
        break;
        case 4:
        tipoCombustible = tipoCom.Biodiesel;
        break;
        default:
        tipoCombustible = tipoCom.Gas_natural;
        }

    System.out.println("Tipo de automóvil: (elige un número) ");
    System.out.println("1) Ciudad");
    System.out.println("2) Compacto");
    System.out.println("3) Subcompacto");
    System.out.println("4) Familiar");
    System.out.println("5) Ejecutivo");
    System.out.println("6) Suv");
    int opcionAuto = scan.nextInt();
    tipoA tipoAutomovil;
    switch (opcionAuto) {
        case 1:
        tipoAutomovil = tipoA.Ciudad;
        break;
        case 2:
        tipoAutomovil = tipoA.Compacto;
        break;
        case 3:
        tipoAutomovil = tipoA.Subcompacto;
        break;
        case 4:
        tipoAutomovil = tipoA.Familiar;
        break;
        case 5:
        tipoAutomovil = tipoA.Ejecutivo;
        break;
        default:
        tipoAutomovil = tipoA.Suv;
        }

    System.out.println("Número de puertas: ");
    int numeroPuertas = scan.nextInt();

    System.out.println("Cantidad de asientos: ");
    int cantidadAsientos = scan.nextInt();

    System.out.println("Velocidad máxima: ");
    int velocidadMaxima = scan.nextInt();

    System.out.println("Color: (elige un número) ");
    System.out.println("1. Blanco");
    System.out.println("2. Negro");
    System.out.println("3. Rojo");
    System.out.println("4. Naranja");
    System.out.println("5. Amarillo");
    System.out.println("6. Verde");
    System.out.println("7. Azul");
    System.out.println("8. Violeta");
    int opcionColor = scan.nextInt();
    tipoColor color;
    switch (opcionColor) {
        case 1:
        color = tipoColor.Blanco;
        break;
        case 2:
        color = tipoColor.Negro;
        break;
        case 3:
        color = tipoColor.Rojo;
        break;
        case 4:
        color = tipoColor.Naranja;
        break;
        case 5:
        color = tipoColor.Amarillo;
        break;
        case 6:
        color = tipoColor.Verde;
        break;
        case 7:
        color = tipoColor.Azul;
        break;
        default:
        color = tipoColor.Violeta;
        }

    Automovil auto1 = new Automovil(marca,modelo,cilindraje,tipoCombustible,tipoAutomovil,numeroPuertas,cantidadAsientos,velocidadMaxima,color);

    System.out.println("    DATOS DE TU AUTOMÓVIL    ");
    auto1.imprimir();

    auto1.setVelocidadActual(100);
    System.out.println("Velocidad actual = "+ auto1.getVelocidadActual()+ " km/h");
    auto1.acelerar(20);
    System.out.println("Velocidad actual = "+ auto1.getVelocidadActual()+ " km/h");
    auto1.desacelerar(50);
    System.out.println("Velocidad actual = "+ auto1.getVelocidadActual()+ " km/h");
    auto1.frenar();
    System.out.println("Velocidad actual = "+ auto1.getVelocidadActual()+ " km/h");
    System.out.println("Ingrese distancia a recorrer (km): ");
    int distancia = scan.nextInt();
    System.out.println("Ingrese la velocidad a la que quiere ir: ");
    int velocidad = scan.nextInt();
    auto1.setVelocidadActual(velocidad);
    double tiempo = auto1.calcularTiempoLlegada(distancia);
    System.out.println("Tiempo estimado de llegada = "+ tiempo + " horas");

    /*Automovil auto1 = new Automovil("Ford", 2018,3,tipoCom.Diesel,tipoA.Ejecutivo,5,6,250,tipoColor.Negro);
    auto1.imprimir();
    auto1.setVelocidadActual(100);
    System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
    auto1.acelerar(20);
    System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
    auto1.desacelerar(50);
    System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
    auto1.frenar();
    System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
    auto1.desacelerar(20);*/
    scan.close();
    }
}
