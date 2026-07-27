import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel lblTipo;
    private JLabel lblaños;
    private JComboBox<String> cmbTipo;
    private JTextField txtaños;
    private JButton btnMostrar;
    private JButton btnLimpiar;
    private JTextArea txtResultado;

    public Ventana() {
        setTitle("Profesores");
        setSize(500, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        lblTipo = new JLabel("Tipo de profesor:");
        lblTipo.setBounds(40, 30, 120, 25);
        add(lblTipo);
        cmbTipo = new JComboBox<>();
        cmbTipo.addItem("Profesor");
        cmbTipo.addItem("Profesor Titular");
        cmbTipo.setBounds(180, 30, 180, 25);
        add(cmbTipo);
        lblaños = new JLabel("Años:");
        lblaños.setBounds(40, 80, 120, 25);
        add(lblaños);
        txtaños = new JTextField();
        txtaños.setBounds(180, 80, 180, 25);
        add(txtaños);
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(80, 130, 120, 35);
        btnMostrar.addActionListener(this);
        add(btnMostrar);
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 130, 120, 35);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 15));
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(40, 190, 400, 150);
        add(scroll);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            Profesor profesor;
            if (cmbTipo.getSelectedIndex() == 0) {
                profesor = new Profesor();
                txtResultado.setText(profesor.imprimir());
            } else {
                int años = Integer.parseInt(txtaños.getText());
                profesor = new ProfesorTitular(años);
                txtResultado.setText(profesor.imprimir());
                if (profesor instanceof ProfesorTitular) {
                    txtResultado.append("\n");
                    txtResultado.append(((ProfesorTitular) profesor).imprimiraños());
                }
            }
        }
        if (e.getSource() == btnLimpiar) {
            cmbTipo.setSelectedIndex(0);
            txtaños.setText("");
            txtResultado.setText("");
        }
    }
}