public class Triangulo {
    int baset;
    int alturat;

    public Triangulo(int baset, int alturat) {
    this.baset = baset;
    this.alturat = alturat;
    }

    double calcularArea() {
    return (baset * alturat / 2);
    }

    double calcularPerímetro() {
    return (baset + alturat + calcularHipotenusa());
    }

    double calcularHipotenusa() {
    return Math.pow(Math.pow(baset,2) + Math.pow(alturat,2), 0.5);
    }
    
    void determinarTipoTriángulo() {
    if ((baset == alturat) && (baset == calcularHipotenusa()) && (alturat== calcularHipotenusa()))
    System.out.println("Es un triángulo equilátero");
    
    else if ((baset != alturat) && (baset != calcularHipotenusa()) && (alturat != calcularHipotenusa()))
    System.out.println("Es un triángulo escaleno");
    
    else
    System.out.println("Es un triángulo isósceles");
    }
}
