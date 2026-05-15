public class circulo {
    double radio;
    double area;
    double longitud;
    public circulo(double radio) {
        this.radio = radio;
        calcular();
    }
    void calcular() {
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
    }
    public void mostrarResultados() {
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}
