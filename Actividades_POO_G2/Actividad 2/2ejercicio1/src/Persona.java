public class Persona {

    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;

    public Persona(String nombre, String apellidos,String numeroDocumentoIdentidad,int anioNacimiento) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
    }

    public void imprimir() {
        System.out.println("      DATOS DE LA PERSONA     ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}