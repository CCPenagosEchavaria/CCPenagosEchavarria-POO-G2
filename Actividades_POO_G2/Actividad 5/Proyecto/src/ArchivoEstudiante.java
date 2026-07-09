import java.io.*;
import java.util.ArrayList;

public class ArchivoEstudiante {

    private File archivo;

    public ArchivoEstudiante() {
        archivo = new File("estudiantes.txt");
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
        }
    }

    public boolean guardar(Estudiante estudiante) {
        if (consultar(estudiante.getCodigo()) != null) {
            return false;
        }
        try {
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(estudiante.getCodigo() + ";"
                    + estudiante.getNombre() + ";"
                    + estudiante.getCarrera() + ";"
                    + estudiante.getSemestre());
            bw.newLine();
            bw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public Estudiante consultar(String codigo) {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(";");
                if (datos[0].equals(codigo)) {
                    br.close();
                    fr.close();
                    return new Estudiante(
                            datos[0],
                            datos[1],
                            datos[2],
                            datos[3]);
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error al consultar.");
        }
        return null;
    }

    public boolean modificar(Estudiante estudiante) {
        ArrayList<String> registros = new ArrayList<String>();
        boolean encontrado = false;
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(";");
                if (datos[0].equals(estudiante.getCodigo())) {
                    registros.add(
                            estudiante.getCodigo() + ";"
                            + estudiante.getNombre() + ";"
                            + estudiante.getCarrera() + ";"
                            + estudiante.getSemestre());
                    encontrado = true;
                } else {
                    registros.add(linea);
                }
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < registros.size(); i++) {
                bw.write(registros.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            return false;
        }
        return encontrado;
    }

    public boolean eliminar(String codigo) {
        ArrayList<String> registros = new ArrayList<String>();
        boolean eliminado = false;
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(";");
                if (!datos[0].equals(codigo)) {
                    registros.add(linea);
                } else {
                    eliminado = true;
                }
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < registros.size(); i++) {
                bw.write(registros.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            return false;
        }
        return eliminado;
    }

    public String mostrarRegistros() {
        String texto = "";
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                texto = texto + linea + "\n";
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            texto = "Error al leer el archivo.";
        }
        return texto;
    }
}