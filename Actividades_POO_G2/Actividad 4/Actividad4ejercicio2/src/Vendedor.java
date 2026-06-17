public class Vendedor {

    private String nombre;
    private String apellidos;
    private int edad;

    public Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }

        if (edad >= 0 && edad < 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
        }
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nEdad: " + edad;
    }
}