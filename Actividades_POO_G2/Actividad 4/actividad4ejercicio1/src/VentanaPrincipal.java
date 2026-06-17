import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JTextField txtNumerador;
    private JTextField txtDenominador;
    private JTextArea txtResultado;
    private JButton btnEjecutar;

    public VentanaPrincipal() {

        setTitle("Manejo de Excepciones");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel panelDatos = new JPanel(new GridLayout(2, 2, 10, 10));

        panelDatos.add(new JLabel("Numerador:"));
        txtNumerador = new JTextField();
        panelDatos.add(txtNumerador);

        panelDatos.add(new JLabel("Denominador:"));
        txtDenominador = new JTextField();
        panelDatos.add(txtDenominador);

        panelPrincipal.add(panelDatos, BorderLayout.NORTH);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(txtResultado);
        panelPrincipal.add(scroll, BorderLayout.CENTER);

        btnEjecutar = new JButton("Ejecutar");
        panelPrincipal.add(btnEjecutar, BorderLayout.SOUTH);

        add(panelPrincipal);

        btnEjecutar.addActionListener(e -> {

            try {

                int numerador =
                        Integer.parseInt(txtNumerador.getText());

                int denominador =
                        Integer.parseInt(txtDenominador.getText());

                // NO CAMBIES ESTA LÍNEA SI TU CONSTRUCTOR YA EXISTE
                PruebaExcepciones prueba =
                        new PruebaExcepciones(numerador, denominador);

                txtResultado.setText(prueba.ejecutar());

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Ingrese únicamente números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        });
    }
}