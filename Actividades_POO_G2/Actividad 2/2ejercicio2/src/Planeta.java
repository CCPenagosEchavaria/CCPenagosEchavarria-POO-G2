public class Planeta {
    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    int diametro;
    int distanciaSol;
    TipoPlaneta tipo;
    boolean esObservable;

    public Planeta(String nombre,int cantidadSatelites,double masa,double volumen,int diametro,int distanciaSol,TipoPlaneta tipo,boolean esObservable) {

        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    public void imprimir() {

        System.out.println("\n----- DATOS DEL PLANETA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable: " + esObservable);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {

        double limite = 149597870 * 3.4;

        return distanciaSol > limite;
    }
}