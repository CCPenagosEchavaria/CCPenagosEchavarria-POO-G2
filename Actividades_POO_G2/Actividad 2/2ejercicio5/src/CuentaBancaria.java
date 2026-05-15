public class CuentaBancaria {
    String nombreTitular;
    String apellidoTitular;
    int numeroCuenta;
    tipoCuenta tipoCuen;
    double saldo = 0;
    CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta, tipoCuenta tipoCuen) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuen = tipoCuen;
    }
    void imprimir() {
        System.out.println("Nombres del titular = " + nombreTitular);
        System.out.println("Apellidos del titular = " + apellidoTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuen);
        System.out.println("Saldo = " + saldo);
    }
    void consultarSaldo() {
    System.out.println("El saldo actual es = " + saldo);
    }
    boolean consignar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } 
        else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        return false;
        }
    }   
    boolean retirar(double valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor; 
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } 
        else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }
}

