import java.awt.event.*;
import javax.swing.*;

public class VentanaCilindro extends JFrame implements ActionListener {

    private JLabel labelRadio;
    private JLabel labelAltura;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    private JTextField campoRadio;
    private JTextField campoAltura;

    private JButton botonCalcular;

    public VentanaCilindro() {

        setTitle("Cilindro");
        setSize(320, 260);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        labelRadio = new JLabel("Radio (cms):");
        labelRadio.setBounds(30, 30, 100, 25);
        add(labelRadio);

        campoRadio = new JTextField();
        campoRadio.setBounds(140, 30, 120, 25);
        add(campoRadio);

        labelAltura = new JLabel("Altura (cms):");
        labelAltura.setBounds(30, 70, 100, 25);
        add(labelAltura);

        campoAltura = new JTextField();
        campoAltura.setBounds(140, 70, 120, 25);
        add(campoAltura);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(90, 110, 120, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        resultadoVolumen = new JLabel("Volumen (cm3): ");
        resultadoVolumen.setBounds(30, 160, 250, 25);
        add(resultadoVolumen);

        resultadoSuperficie = new JLabel("Superficie (cm2): ");
        resultadoSuperficie.setBounds(30, 190, 250, 25);
        add(resultadoSuperficie);
    }

    public void actionPerformed(ActionEvent e) {

        double radio = Double.parseDouble(campoRadio.getText());
        double altura = Double.parseDouble(campoAltura.getText());

        Cilindro cilindro = new Cilindro(radio, altura);

        resultadoVolumen.setText(
            "Volumen (cm3): " +
            String.format("%.2f", cilindro.getVolumen())
        );

        resultadoSuperficie.setText(
            "Superficie (cm2): " +
            String.format("%.2f", cilindro.getSuperficie())
        );
    }
}