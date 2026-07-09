import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JLabel lblTitulo;
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JLabel lblCarrera;
    private JLabel lblSemestre;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtCarrera;
    private JTextField txtSemestre;
    private JButton btnGuardar;
    private JButton btnConsultar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnMostrar;
    private JButton btnLimpiar;
    private JTextArea txtResultado;
    private ArchivoEstudiante archivo;

    public VentanaPrincipal() {
        archivo = new ArchivoEstudiante();
        setTitle("Gestor de Estudiantes");
        setSize(600, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Container c = getContentPane();
        c.setLayout(null);
        lblTitulo = new JLabel("GESTOR DE ESTUDIANTES");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(160, 20, 300, 30);
        c.add(lblTitulo);
        lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(50, 80, 100, 25);
        c.add(lblCodigo);
        txtCodigo = new JTextField();
        txtCodigo.setBounds(170, 80, 320, 25);
        c.add(txtCodigo);
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 120, 100, 25);
        c.add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(170, 120, 320, 25);
        c.add(txtNombre);
        lblCarrera = new JLabel("Carrera:");
        lblCarrera.setBounds(50, 160, 100, 25);
        c.add(lblCarrera);
        txtCarrera = new JTextField();
        txtCarrera.setBounds(170, 160, 320, 25);
        c.add(txtCarrera);
        lblSemestre = new JLabel("Semestre:");
        lblSemestre.setBounds(50, 200, 100, 25);
        c.add(lblSemestre);
        txtSemestre = new JTextField();
        txtSemestre.setBounds(170, 200, 320, 25);
        c.add(txtSemestre);
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(30, 260, 100, 35);
        btnGuardar.addActionListener(this);
        c.add(btnGuardar);
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(140, 260, 100, 35);
        btnConsultar.addActionListener(this);
        c.add(btnConsultar);
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(250, 260, 100, 35);
        btnModificar.addActionListener(this);
        c.add(btnModificar);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(360, 260, 100, 35);
        btnEliminar.addActionListener(this);
        c.add(btnEliminar);
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(470, 260, 100, 35);
        btnMostrar.addActionListener(this);
        c.add(btnMostrar);
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(240, 310, 100, 35);
        btnLimpiar.addActionListener(this);
        c.add(btnLimpiar);
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(10, 10, 10, 10));
        txtResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(30, 360, 540, 120);
        c.add(scroll);
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
        txtCodigo.requestFocus();
    }

    public boolean validarCampos() {
        if (txtCodigo.getText().trim().equals("") ||
            txtNombre.getText().trim().equals("") ||
            txtCarrera.getText().trim().equals("") ||
            txtSemestre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return false;
        }
        return true;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            if (!validarCampos())
                return;
            Estudiante estudiante = new Estudiante(
                    txtCodigo.getText().trim(),
                    txtNombre.getText().trim(),
                    txtCarrera.getText().trim(),
                    txtSemestre.getText().trim());
            if (archivo.guardar(estudiante)) {
                limpiar();
                txtResultado.setText("Registro guardado correctamente.");
            } else {
                txtResultado.setText("Ya existe un estudiante con ese código.");
            }
        }
        if (e.getSource() == btnConsultar) {
            if (txtCodigo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese el código.");
                return;
            }
            Estudiante estudiante = archivo.consultar(txtCodigo.getText().trim());
            if (estudiante != null) {
                txtNombre.setText(estudiante.getNombre());
                txtCarrera.setText(estudiante.getCarrera());
                txtSemestre.setText(estudiante.getSemestre());
                txtResultado.setText("Registro encontrado.");
            } else {
                txtResultado.setText("No existe el estudiante.");
            }
        }
        if (e.getSource() == btnModificar) {
            if (!validarCampos())
                return;
            Estudiante estudiante = new Estudiante(
                    txtCodigo.getText().trim(),
                    txtNombre.getText().trim(),
                    txtCarrera.getText().trim(),
                    txtSemestre.getText().trim());
            if (archivo.modificar(estudiante)) {
                txtResultado.setText("Registro modificado correctamente.");
            } else {
                txtResultado.setText("No se encontró el registro.");
            }
        }
        if (e.getSource() == btnEliminar) {
            if (txtCodigo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese el código.");
                return;
            }
            if (archivo.eliminar(txtCodigo.getText().trim())) {
                limpiar();
                txtResultado.setText("Registro eliminado correctamente.");
            } else {
                txtResultado.setText("No existe el registro.");
            }
        }
        if (e.getSource() == btnMostrar) {
            txtResultado.setText(archivo.mostrarRegistros());
        }
        if (e.getSource() == btnLimpiar) {
            limpiar();
            txtResultado.setText("");
        }
    }
}