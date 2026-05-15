import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("    Datos personales    ");

    System.out.println("Ingrese el nombre del titular: ");
    String nombreTitular=scan.nextLine();

    System.out.println("Ingrese el apellido del titular: ");
    String apellidoTitular=scan.nextLine();

    System.out.println("Ingrese el número de cuenta: ");
    int numeroCuenta=scan.nextInt();

    /*System.out.println("Ingrese el tipo de cuenta(Ahorros o Corriente): ");
    String tipoCuenta=scan.nextLine();*/

    System.out.println("Elija su tipo de cuenta: (Digite el número) ");
    System.out.println("1) Ahorros");
    System.out.println("2) Corriente");
    int cuen = scan.nextInt();
    tipoCuenta tipoCuen;
    switch (cuen) {
        case 1:
            tipoCuen=tipoCuenta.Ahorros;
            break;
        case 2:
            tipoCuen=tipoCuenta.Corriente;
            break;
        default:
            tipoCuen=tipoCuenta.Ahorros;
            break;
    }

    CuentaBancaria cuenta = new CuentaBancaria(nombreTitular,apellidoTitular,numeroCuenta,tipoCuen);
    System.out.println("    Datos de la cuenta    ");
    cuenta.imprimir();

    System.out.println("Ingrese el valor a consignar: ");
    int consignacion=scan.nextInt();
    cuenta.consignar(consignacion);

    System.out.println("Ingrese el valor a retirar: ");
    int retiro = scan.nextInt();
    cuenta.retirar(retiro);

    System.out.println("Saldo actual: ");
    cuenta.consultarSaldo();
    /*cuenta.consignar(200000);
    cuenta.consignar(300000);
    cuenta.retirar(400000);*/
    scan.close();
    }
    }
