import java.awt.event.*;
import javax.swing.*;

public class VentanaPiramide extends JFrame implements ActionListener {

    private JLabel labelBase;
    private JLabel labelAltura;
    private JLabel labelApotema;

    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    private JTextField campoBase;
    private JTextField campoAltura;
    private JTextField campoApotema;

    private JButton botonCalcular;

    public VentanaPiramide() {

        setTitle("Pirámide");
        setSize(340, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        labelBase = new JLabel("Base (cms):");
        labelBase.setBounds(30, 30, 100, 25);
        add(labelBase);

        campoBase = new JTextField();
        campoBase.setBounds(150, 30, 120, 25);
        add(campoBase);

        labelAltura = new JLabel("Altura (cms):");
        labelAltura.setBounds(30, 70, 100, 25);
        add(labelAltura);

        campoAltura = new JTextField();
        campoAltura.setBounds(150, 70, 120, 25);
        add(campoAltura);

        labelApotema = new JLabel("Apotema (cms):");
        labelApotema.setBounds(30, 110, 120, 25);
        add(labelApotema);

        campoApotema = new JTextField();
        campoApotema.setBounds(150, 110, 120, 25);
        add(campoApotema);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(100, 150, 120, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        resultadoVolumen = new JLabel("Volumen (cm3): ");
        resultadoVolumen.setBounds(30, 200, 250, 25);
        add(resultadoVolumen);

        resultadoSuperficie = new JLabel("Superficie (cm2): ");
        resultadoSuperficie.setBounds(30, 230, 250, 25);
        add(resultadoSuperficie);
    }

    public void actionPerformed(ActionEvent e) {

        double base = Double.parseDouble(campoBase.getText());
        double altura = Double.parseDouble(campoAltura.getText());
        double apotema = Double.parseDouble(campoApotema.getText());

        Piramide piramide = new Piramide(base, altura, apotema);

        resultadoVolumen.setText(
            "Volumen (cm3): " +
            String.format("%.2f", piramide.getVolumen())
        );

        resultadoSuperficie.setText(
            "Superficie (cm2): " +
            String.format("%.2f", piramide.getSuperficie())
        );
    }
}