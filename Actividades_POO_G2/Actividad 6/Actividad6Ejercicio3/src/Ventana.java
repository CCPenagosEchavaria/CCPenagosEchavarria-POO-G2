import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel lblProfesor;
    private JComboBox<String> cmbProfesor;
    private JButton btnMostrar;
    private JButton btnLimpiar;
    private JTextArea txtResultado;

    public Ventana() {
        setTitle("Profesores");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        lblProfesor = new JLabel("Tipo de profesor:");
        lblProfesor.setBounds(40, 30, 120, 30);
        add(lblProfesor);
        cmbProfesor = new JComboBox<>();
        cmbProfesor.addItem("Profesor");
        cmbProfesor.addItem("Profesor Titular");
        cmbProfesor.setBounds(170, 30, 200, 30);
        add(cmbProfesor);
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(90, 90, 120, 35);
        btnMostrar.addActionListener(this);
        add(btnMostrar);
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 90, 120, 35);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(40, 160, 400, 150);
        add(scroll);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            Profesor profesor;
            if (cmbProfesor.getSelectedIndex() == 0) {
                profesor = new Profesor();
            } else {
                profesor = new ProfesorTitular();
            }
            txtResultado.setText(profesor.imprimir());
        }
        if (e.getSource() == btnLimpiar) {
            cmbProfesor.setSelectedIndex(0);
            txtResultado.setText("");
        }
    }
}