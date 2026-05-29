import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JLabel Nota1, Nota2, Nota3, Nota4, Nota5;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton botonCalcular, botonLimpiar;
    private JLabel resultadoPromedio, resultadoDesviacion, resultadoMayor, resultadoMenor;

    private Notas notas;

    public VentanaPrincipal() {

        notas = new Notas();

        setTitle("Notas");
        setSize(300, 380);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Nota1 = new JLabel("Nota 1:");
        Nota1.setBounds(30, 20, 80, 25);
        add(Nota1);

        campoNota1 = new JTextField();
        campoNota1.setBounds(120, 20, 100, 25);
        add(campoNota1);

        Nota2 = new JLabel("Nota 2:");
        Nota2.setBounds(30, 50, 80, 25);
        add(Nota2);

        campoNota2 = new JTextField();
        campoNota2.setBounds(120, 50, 100, 25);
        add(campoNota2);

        Nota3 = new JLabel("Nota 3:");
        Nota3.setBounds(30, 80, 80, 25);
        add(Nota3);

        campoNota3 = new JTextField();
        campoNota3.setBounds(120, 80, 100, 25);
        add(campoNota3);

        Nota4 = new JLabel("Nota 4:");
        Nota4.setBounds(30, 110, 80, 25);
        add(Nota4);

        campoNota4 = new JTextField();
        campoNota4.setBounds(120, 110, 100, 25);
        add(campoNota4);

        Nota5 = new JLabel("Nota 5:");
        Nota5.setBounds(30, 140, 80, 25);
        add(Nota5);

        campoNota5 = new JTextField();
        campoNota5.setBounds(120, 140, 100, 25);
        add(campoNota5);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(40, 180, 100, 30);
        botonCalcular.addActionListener(this);
        add(botonCalcular);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(160, 180, 100, 30);
        botonLimpiar.addActionListener(this);
        add(botonLimpiar);

        resultadoPromedio = new JLabel("Promedio = ");
        resultadoPromedio.setBounds(30, 230, 250, 25);
        add(resultadoPromedio);

        resultadoDesviacion = new JLabel("Desviación estándar = ");
        resultadoDesviacion.setBounds(30, 255, 250, 25);
        add(resultadoDesviacion);

        resultadoMayor = new JLabel("Valor mayor = ");
        resultadoMayor.setBounds(30, 280, 250, 25);
        add(resultadoMayor);

        resultadoMenor = new JLabel("Valor menor = ");
        resultadoMenor.setBounds(30, 305, 250, 25);
        add(resultadoMenor);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonCalcular) {

            notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());

            resultadoPromedio.setText("Promedio = " + String.format("%.2f", notas.calcularPromedio()));
            resultadoDesviacion.setText("Desviación estándar = " + String.format("%.2f", notas.calcularDesviación()));
            resultadoMayor.setText("Valor mayor = " + notas.calcularMayor());
            resultadoMenor.setText("Valor menor = " + notas.calcularMenor());
        }

        if (e.getSource() == botonLimpiar) {

            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");

            resultadoPromedio.setText("Promedio = ");
            resultadoDesviacion.setText("Desviación estándar = ");
            resultadoMayor.setText("Valor mayor = ");
            resultadoMenor.setText("Valor menor = ");
        }
    }
}