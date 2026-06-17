import javax.swing.*;
import java.awt.event.*;

public class VentanaCalculos extends JFrame implements ActionListener {

    JTextField txtValor;
    JButton btnCalcular;

    public VentanaCalculos() {

        setTitle("Cálculos Numéricos");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblValor = new JLabel("Valor:");
        lblValor.setBounds(30, 30, 80, 25);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(100, 30, 150, 25);
        add(txtValor);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 80, 120, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        setLocationRelativeTo(null);
        setVisible(true);
    }

public void actionPerformed(ActionEvent e) {

    try {

        double valor = Double.parseDouble(txtValor.getText());

        String mensaje = "";

        try {
            double logaritmo =
                    CalculosNumericos.calcularLogaritmoNeperiano(valor);

            mensaje += "Logaritmo Neperiano: " + logaritmo + "\n";

        } catch (ArithmeticException ex) {
            mensaje += ex.getMessage() + "\n";
        }

        try {
            double raiz =
                    CalculosNumericos.calcularRaizCuadrada(valor);

            mensaje += "Raíz Cuadrada: " + raiz;

        } catch (ArithmeticException ex) {
            mensaje += ex.getMessage();
        }

        JOptionPane.showMessageDialog(this, mensaje);

    } catch (NumberFormatException ex) {

        JOptionPane.showMessageDialog(this,
                "Debe ingresar un valor numérico.");
    }
}
}