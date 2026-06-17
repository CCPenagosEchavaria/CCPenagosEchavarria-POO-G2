public class PruebaExcepciones {

    private int numerador;
    private int denominador;

    public PruebaExcepciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String ejecutar() {

        StringBuilder salida = new StringBuilder();

        try {
            salida.append("Ingresando al primer try\n");

            int resultado = numerador / denominador;

            salida.append("Resultado de la división: " + resultado + "\n");
            salida.append("Después de la división\n");

        } catch (ArithmeticException e) {
            salida.append("División por cero\n");
        } finally {
            salida.append("Ingresando al primer finally\n");
        }

        try {
            salida.append("Ingresando al segundo try\n");

            Object objeto = null;
            objeto.toString();

            salida.append("Imprimiendo objeto\n");

        } catch (ArithmeticException e) {
            salida.append("División por cero\n");
        } catch (Exception e) {
            salida.append("Ocurrió una excepción\n");
        } finally {
            salida.append("Ingresando al segundo finally\n");
        }

        return salida.toString();
    }
}