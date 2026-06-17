public class EquipoMaratonProgramacion {

    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;

    Programador[] programadores;
    int tamañoEquipo;

    public EquipoMaratonProgramacion(
            String nombreEquipo,
            String universidad,
            String lenguajeProgramacion) {

        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;

        programadores = new Programador[3];
        tamañoEquipo = 0;
    }

    public boolean estaLleno() {
        return tamañoEquipo == 3;
    }

    public void añadir(Programador p) throws Exception {

        if (estaLleno()) {
            throw new Exception(
                    "El equipo está completo.");
        }

        programadores[tamañoEquipo] = p;
        tamañoEquipo++;
    }

    public static void validarCampo(
            String campo) throws Exception {

        for (int i = 0; i < campo.length(); i++) {

            if (Character.isDigit(
                    campo.charAt(i))) {

                throw new Exception(
                        "El nombre no puede tener dígitos");
            }
        }

        if (campo.length() > 20) {

            throw new Exception(
                    "Máximo 20 caracteres");
        }
    }

}