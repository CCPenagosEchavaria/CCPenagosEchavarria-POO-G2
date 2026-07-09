public class Estudiante {

    private String codigo;
    private String nombre;
    private String carrera;
    private String semestre;

    public Estudiante(String codigo, String nombre, String carrera, String semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}
