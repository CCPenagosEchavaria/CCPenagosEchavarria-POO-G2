public class Operacion {
    double suma;
    double x;
    double y;
    public Operacion() {
        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + (x / y);
    }
    public double getSuma() {
        return suma;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void mostrarResultado() {
        System.out.println("El valor de la suma es: " + suma);
    }
}
