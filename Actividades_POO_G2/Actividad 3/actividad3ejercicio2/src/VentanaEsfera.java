import java.awt.event.*;
import javax.swing.*;

public class VentanaEsfera extends JFrame implements ActionListener {

    private JLabel labelRadio;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    private JTextField campoRadio;

    private JButton botonCalcular;

    public VentanaEsfera() {

        setTitle("Esfera");
        setSize(320, 230);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        labelRadio = new JLabel("Radio (cms):");
        labelRadio.setBounds(30, 30, 100, 25);
        add(labelRadio);

        campoRadio = new JTextField();
        campoRadio.setBounds(140, 30, 120, 25);
        add(campoRadio);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(90, 80, 120, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        resultadoVolumen = new JLabel("Volumen (cm3): ");
        resultadoVolumen.setBounds(30, 130, 250, 25);
        add(resultadoVolumen);

        resultadoSuperficie = new JLabel("Superficie (cm2): ");
        resultadoSuperficie.setBounds(30, 160, 250, 25);
        add(resultadoSuperficie);
    }

    public void actionPerformed(ActionEvent e) {

        double radio = Double.parseDouble(campoRadio.getText());

        Esfera esfera = new Esfera(radio);

        resultadoVolumen.setText(
            "Volumen (cm3): " +
            String.format("%.2f", esfera.getVolumen())
        );

        resultadoSuperficie.setText(
            "Superficie (cm2): " +
            String.format("%.2f", esfera.getSuperficie())
        );
    }
}