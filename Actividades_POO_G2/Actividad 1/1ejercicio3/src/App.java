public class App {
    public static void main(String[] args) throws Exception {
        int horasTrabajadas = 48;
        int valorHora = 5000;
        empleado emple = new empleado(horasTrabajadas, valorHora);
        emple.mostrarresultados();
    }
}
