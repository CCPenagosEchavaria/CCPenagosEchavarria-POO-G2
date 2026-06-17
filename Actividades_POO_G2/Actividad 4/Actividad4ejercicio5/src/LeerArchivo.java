import java.io.*;

public class LeerArchivo {

    public static String leer(
            String ruta)
            throws Exception {

        FileInputStream archivo =
                new FileInputStream(
                        ruta);

        InputStreamReader conversor =
                new InputStreamReader(
                        archivo);

        BufferedReader filtro =
                new BufferedReader(
                        conversor);

        String texto = "";

        String linea =
                filtro.readLine();

        while (linea != null) {

            texto +=
                    linea
                    + "\n";

            linea =
                    filtro.readLine();

        }

        filtro.close();

        return texto;

    }

}