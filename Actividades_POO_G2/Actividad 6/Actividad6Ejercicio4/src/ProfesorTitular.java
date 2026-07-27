public class ProfesorTitular extends Profesor {
    private int años;
    public ProfesorTitular(int años) {
        this.años = años;
    }
    protected String imprimir() {
        return "Es un profesor titular.";
    }
    protected String imprimiraños() {
        return "Años = " + años;
    }
}