import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    JTextField txtEquipo;
    JTextField txtUniversidad;
    JTextField txtLenguaje;

    JTextField txtNombre;
    JTextField txtApellido;

    JTextArea area;

    EquipoMaratonProgramacion equipo;

    public VentanaPrincipal() {

        setTitle("Equipo Maratón");

        setSize(600, 500);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        setLayout(
                new BorderLayout(
                        15,
                        15));


        JPanel panel =
                new JPanel(
                        new GridLayout(
                                6,
                                2,
                                20,
                                15));


        txtEquipo =
                new JTextField();

        txtUniversidad =
                new JTextField();

        txtLenguaje =
                new JTextField();

        txtNombre =
                new JTextField();

        txtApellido =
                new JTextField();


        JButton crear =
                new JButton(
                        "Crear");

        JButton agregar =
                new JButton(
                        "Agregar");


        panel.add(
                new JLabel(
                        "Nombre equipo"));

        panel.add(
                txtEquipo);


        panel.add(
                new JLabel(
                        "Universidad"));

        panel.add(
                txtUniversidad);


        panel.add(
                new JLabel(
                        "Lenguaje"));

        panel.add(
                txtLenguaje);


        panel.add(
                new JLabel(
                        "Nombre integrante"));

        panel.add(
                txtNombre);


        panel.add(
                new JLabel(
                        "Apellido"));

        panel.add(
                txtApellido);


        panel.add(
                crear);

        panel.add(
                agregar);


        area =
                new JTextArea();

        area.setEditable(
                false);


        JScrollPane scroll =
                new JScrollPane(
                        area);


        add(
                panel,
                BorderLayout.NORTH);

        add(
                scroll,
                BorderLayout.CENTER);


        crear.addActionListener(
                e -> {

                    equipo =
                            new EquipoMaratonProgramacion(
                                    txtEquipo.getText(),
                                    txtUniversidad.getText(),
                                    txtLenguaje.getText());

                    area.setText(
                            "Equipo creado\n\n");

                });


        agregar.addActionListener(
                e -> {

                    try {

                        if (
                                equipo
                                ==
                                null) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Primero cree el equipo");

                            return;
                        }


                        String nombre =
                                txtNombre.getText();

                        String apellido =
                                txtApellido.getText();


                        EquipoMaratonProgramacion
                                .validarCampo(
                                        nombre);

                        EquipoMaratonProgramacion
                                .validarCampo(
                                        apellido);


                        Programador p =
                                new Programador(
                                        nombre,
                                        apellido);


                        equipo.añadir(
                                p);


                        area.append(
                                nombre
                                + " "
                                + apellido
                                + "\n");


                        txtNombre.setText(
                                "");

                        txtApellido.setText(
                                "");


                    }

                    catch (
                            Exception ex) {

                        JOptionPane.showMessageDialog(
                                null,
                                ex.getMessage());

                    }

                });

    }

}