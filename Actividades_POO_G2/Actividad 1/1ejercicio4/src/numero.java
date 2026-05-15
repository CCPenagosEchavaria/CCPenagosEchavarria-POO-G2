/*public class numero {
    int numero;
    int cuadrado;
    int cubo;
    public numero(int num);
        this.numero = num;
        calcular();
    }
    void calcular() {
        cuadrado = (int) Math.pow(numero, 2);
        cubo = (int) Math.pow(numero, 3);
    }
    public void mostrarResultados() {
        System.out.println("EL CUADRADO ES: " + cuadrado);
        System.out.println("EL CUBO ES: " + cubo);
    }
}*/
// numero.java
public class numero {

    int numero;
    int cuadrado;
    int cubo;

    public numero(int numero) {
        this.numero = numero;
        calcular();
    }
    void calcular() {
        cuadrado = (int) Math.pow(numero, 2);
        cubo = (int) Math.pow(numero, 3);
    }
    public void mostrarResultados() {
        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
}
