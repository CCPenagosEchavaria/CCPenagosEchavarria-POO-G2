import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JButton botonCilindro;
    private JButton botonEsfera;
    private JButton botonPiramide;

    public VentanaPrincipal() {

        setTitle("Figuras");
        setSize(420, 180);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        botonCilindro = new JButton("Cilindro");
        botonCilindro.setBounds(30, 50, 100, 30);
        botonCilindro.addActionListener(this);
        add(botonCilindro);

        botonEsfera = new JButton("Esfera");
        botonEsfera.setBounds(150, 50, 100, 30);
        botonEsfera.addActionListener(this);
        add(botonEsfera);

        botonPiramide = new JButton("Pirámide");
        botonPiramide.setBounds(270, 50, 100, 30);
        botonPiramide.addActionListener(this);
        add(botonPiramide);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botonCilindro) {
            VentanaCilindro ventana = new VentanaCilindro();
            ventana.setVisible(true);
        }

        if(e.getSource() == botonEsfera) {
            VentanaEsfera ventana = new VentanaEsfera();
            ventana.setVisible(true);
        }

        if(e.getSource() == botonPiramide) {
            VentanaPiramide ventana = new VentanaPiramide();
            ventana.setVisible(true);
        }
    }
}