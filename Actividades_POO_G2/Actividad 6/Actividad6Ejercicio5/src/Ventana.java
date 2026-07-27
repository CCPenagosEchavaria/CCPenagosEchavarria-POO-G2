import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel lblAnimal;
    private JComboBox<String> cmbAnimal;
    private JButton btnMostrar;
    private JButton btnLimpiar;
    private JTextArea txtResultado;

    public Ventana() {
        setTitle("Animales");
        setSize(500, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        lblAnimal = new JLabel("Seleccione un animal:");
        lblAnimal.setBounds(40, 30, 150, 25);
        add(lblAnimal);
        cmbAnimal = new JComboBox<>();
        cmbAnimal.addItem("Perro");
        cmbAnimal.addItem("Lobo");
        cmbAnimal.addItem("Gato");
        cmbAnimal.addItem("León");
        cmbAnimal.setBounds(190, 30, 180, 25);
        add(cmbAnimal);
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(80, 80, 120, 35);
        btnMostrar.addActionListener(this);
        add(btnMostrar);
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250, 80, 120, 35);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 15));
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(40, 140, 400, 200);
        add(scroll);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            Animal animal;
            switch (cmbAnimal.getSelectedIndex()) {
                case 0:
                    animal = new Perro();
                    break;
                case 1:
                    animal = new Lobo();
                    break;
                case 2:
                    animal = new Gato();
                    break;
                default:
                    animal = new Leon();
                    break;
            }
            txtResultado.setText(
                    "Nombre científico: " + animal.getNombreCientifico()
                    + "\n\nSonido: " + animal.getSonido()
                    + "\n\nAlimentos: " + animal.getAlimentos()
                    + "\n\nHábitat: " + animal.getHabitat());
        }
        if (e.getSource() == btnLimpiar) {
            cmbAnimal.setSelectedIndex(0);
            txtResultado.setText("");
        }
    }
}