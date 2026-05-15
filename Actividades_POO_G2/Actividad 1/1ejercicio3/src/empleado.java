public class empleado {

    int horastrabajadas;
    int valorhora;
    double salariobruto;
    double retencionfuente;
    double salarioneto;
    public empleado(int horastrabajadas, int valorhora) {
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
        calcularsalario();
    }
    void calcularsalario() {
        salariobruto = horastrabajadas * valorhora;
        retencionfuente = salariobruto * 0.125;
        salarioneto = salariobruto - retencionfuente;
    }
    public double getSalariobruto() {
        return salariobruto;
    }
    public double getretencionfuente() {
        return retencionfuente;
    }
    public double getSalarioneto() {
        return salarioneto;
    }
    public void mostrarresultados() {
        System.out.println("Salario: $" + salariobruto);
        System.out.println("Retención en la fuemte: $" + retencionfuente);
        System.out.println("Salario neto: $" + salarioneto);
    }
}
