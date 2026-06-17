import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

public class Ventana extends JFrame {

    JTextArea area;

    public Ventana() {

        setTitle("Leer Archivo");

        setSize(300, 300);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        setLayout(
                new BorderLayout());


        JButton abrir =
                new JButton(
                        "Abrir TXT");


        area =
                new JTextArea();

        area.setEditable(
                false);


        add(
                abrir,
                BorderLayout.NORTH);

        add(
                new JScrollPane(
                        area),
                BorderLayout.CENTER);



        abrir.addActionListener(
                e -> {

                    JFileChooser selector =
                            new JFileChooser();


                    selector.setFileFilter(

                            new FileNameExtensionFilter(

                                    "Archivos TXT",

                                    "txt"

                            )

                    );


                    int opcion =

                            selector
                                    .showOpenDialog(
                                            null);


                    if (
                            opcion
                            ==
                            JFileChooser.APPROVE_OPTION) {

                        try {

                            String ruta =

                                    selector
                                            .getSelectedFile()
                                            .getAbsolutePath();


                            if (
                                    !ruta.endsWith(
                                            ".txt")) {

                                throw new Exception();

                            }


                            String texto =

                                    LeerArchivo
                                            .leer(
                                                    ruta);


                            area.setText(
                                    texto);

                        }

                        catch (
                                Exception ex) {

                            JOptionPane
                                    .showMessageDialog(

                                            null,

                                            "Seleccione un archivo TXT"

                                    );

                        }

                    }

                });

    }

}