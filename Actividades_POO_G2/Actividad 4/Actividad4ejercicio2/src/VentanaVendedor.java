import javax.swing.*;
import java.awt.event.*;

public class VentanaVendedor extends JFrame implements ActionListener {

    JTextField txtNombre, txtApellidos, txtEdad;
    JButton btnRegistrar;

    public VentanaVendedor() {

        setTitle("Vendedor");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 150, 25);
        add(txtNombre);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(20, 60, 80, 25);
        add(lblApellidos);

        txtApellidos = new JTextField();
        txtApellidos.setBounds(100, 60, 150, 25);
        add(txtApellidos);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 100, 80, 25);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(100, 100, 150, 25);
        add(txtEdad);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(90, 150, 120, 30);
        btnRegistrar.addActionListener(this);
        add(btnRegistrar);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            int edad = Integer.parseInt(txtEdad.getText());

            Vendedor vendedor = new Vendedor(nombre, apellidos);
            vendedor.verificarEdad(edad);

            JOptionPane.showMessageDialog(this,
                    vendedor.mostrarDatos());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "La edad debe ser un número.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage());
        }
    }
}