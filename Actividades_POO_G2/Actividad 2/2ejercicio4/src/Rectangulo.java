public class Rectangulo {
    int baser;
    int alturar;

    Rectangulo(int baser, int alturar) {
    this.baser = baser;
    this.alturar = alturar;
    }

    double calcularArea() {
    return baser * alturar;
    }

    double calcularPerímetro() {
    return (2 * baser) + (2 * alturar);
    }
}