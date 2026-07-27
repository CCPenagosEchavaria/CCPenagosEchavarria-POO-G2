import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JLabel lblTitulo, lblAutor, lblPalabra1, lblPalabra2, lblPalabra3;
    private JLabel lblPublicacion, lblaño, lblResumen;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtPalabra1;
    private JTextField txtPalabra2;
    private JTextField txtPalabra3;
    private JTextField txtPublicacion;
    private JTextField txtaño;
    private JTextArea txtResumen;
    private JTextArea txtResultado;
    private JButton btnCrear;
    private JButton btnLimpiar;

    public Ventana() {
        setTitle("Artículo Científico");
        setSize(650, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(30, 20, 100, 25);
        add(lblTitulo);
        txtTitulo = new JTextField();
        txtTitulo.setBounds(150, 20, 430, 25);
        add(txtTitulo);
        lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(30, 60, 100, 25);
        add(lblAutor);
        txtAutor = new JTextField();
        txtAutor.setBounds(150, 60, 430, 25);
        add(txtAutor);
        lblPalabra1 = new JLabel("Palabra 1:");
        lblPalabra1.setBounds(30, 100, 100, 25);
        add(lblPalabra1);
        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(150, 100, 150, 25);
        add(txtPalabra1);
        lblPalabra2 = new JLabel("Palabra 2:");
        lblPalabra2.setBounds(320, 100, 100, 25);
        add(lblPalabra2);
        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(410, 100, 170, 25);
        add(txtPalabra2);
        lblPalabra3 = new JLabel("Palabra 3:");
        lblPalabra3.setBounds(30, 140, 100, 25);
        add(lblPalabra3);
        txtPalabra3 = new JTextField();
        txtPalabra3.setBounds(150, 140, 150, 25);
        add(txtPalabra3);
        lblPublicacion = new JLabel("Publicación:");
        lblPublicacion.setBounds(30, 180, 100, 25);
        add(lblPublicacion);
        txtPublicacion = new JTextField();
        txtPublicacion.setBounds(150, 180, 430, 25);
        add(txtPublicacion);
        lblaño = new JLabel("Año:");
        lblaño.setBounds(30, 220, 100, 25);
        add(lblaño);
        txtaño = new JTextField();
        txtaño.setBounds(150, 220, 120, 25);
        add(txtaño);
        lblResumen = new JLabel("Resumen:");
        lblResumen.setBounds(30, 260, 100, 25);
        add(lblResumen);
        txtResumen = new JTextArea();
        JScrollPane scrollResumen = new JScrollPane(txtResumen);
        scrollResumen.setBounds(150, 260, 430, 100);
        add(scrollResumen);
        btnCrear = new JButton("Crear Artículo");
        btnCrear.setBounds(150, 380, 150, 35);
        btnCrear.addActionListener(this);
        add(btnCrear);
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(330, 380, 150, 35);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);
        scrollResultado.setBounds(30, 440, 550, 180);
        add(scrollResultado);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCrear) {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            String p1 = txtPalabra1.getText();
            String p2 = txtPalabra2.getText();
            String p3 = txtPalabra3.getText();
            String publicacion = txtPublicacion.getText();
            String resumen = txtResumen.getText();
            ArticuloCientifico articulo;
            if (publicacion.isEmpty()) {
                articulo = new ArticuloCientifico(titulo, autor);
            } else if (resumen.isEmpty()) {
                String[] palabras = {p1, p2, p3};
                articulo = new ArticuloCientifico(
                        titulo,
                        autor,
                        palabras,
                        publicacion,
                        Integer.parseInt(txtaño.getText())
                );
            } else {
                String[] palabras = {p1, p2, p3};
                articulo = new ArticuloCientifico(
                        titulo,
                        autor,
                        palabras,
                        publicacion,
                        Integer.parseInt(txtaño.getText()),
                        resumen
                );
            }
            txtResultado.setText(articulo.imprimir());
        }
        if (e.getSource() == btnLimpiar) {
            txtTitulo.setText("");
            txtAutor.setText("");
            txtPalabra1.setText("");
            txtPalabra2.setText("");
            txtPalabra3.setText("");
            txtPublicacion.setText("");
            txtaño.setText("");
            txtResumen.setText("");
            txtResultado.setText("");
        }
    }
}