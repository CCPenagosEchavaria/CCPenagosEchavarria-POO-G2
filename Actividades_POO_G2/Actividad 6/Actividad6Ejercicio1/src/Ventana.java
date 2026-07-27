import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private JComboBox<String> cmbPlatos;
    private JTextArea txtPedido;
    private JTextField txtTotal;
    private JButton btnAgregar;
    private JButton btnFinalizar;
    private JButton btnNuevo;
    private Pedido pedido;
    private String[] platos = {
            "Sancocho",
            "Crema de Verduras",
            "Churrasco",
            "Salmón",
            "Tiramisú",
            "Gaseosa",
            "Jugo Natural"
    };    
    private int[] precios = {
            5000,
            4500,
            12000,
            15000,
            5000,
            2000,
            3000
    };

    public Ventana() {
        pedido = new Pedido();
        setTitle("Restaurante");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lblTitulo = new JLabel("RESTAURANTE");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(170, 20, 200, 30);
        add(lblTitulo);
        JLabel lblPlatos = new JLabel("Seleccione un producto:");
        lblPlatos.setBounds(40, 70, 180, 25);
        add(lblPlatos);
        cmbPlatos = new JComboBox<>();
        for (int i = 0; i < platos.length; i++) {
            cmbPlatos.addItem(platos[i] + "  -  $" + precios[i]);
        }
        cmbPlatos.setBounds(40, 100, 250, 30);
        add(cmbPlatos);
        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(320, 100, 120, 30);
        btnAgregar.addActionListener(this);
        add(btnAgregar);
        JLabel lblPedido = new JLabel("Pedido:");
        lblPedido.setBounds(40, 150, 100, 25);
        add(lblPedido);
        txtPedido = new JTextArea();
        txtPedido.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtPedido);
        scroll.setBounds(40, 180, 400, 170);
        add(scroll);
        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(40, 370, 60, 25);
        add(lblTotal);
        txtTotal = new JTextField("0");
        txtTotal.setEditable(false);
        txtTotal.setBounds(90, 370, 120, 30);
        add(txtTotal);
        btnFinalizar = new JButton("Finalizar Pedido");
        btnFinalizar.setBounds(40, 420, 180, 30);
        btnFinalizar.addActionListener(this);
        add(btnFinalizar);
        btnNuevo = new JButton("Nuevo Pedido");
        btnNuevo.setBounds(250, 420, 180, 30);
        btnNuevo.addActionListener(this);
        add(btnNuevo);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            int opcion = cmbPlatos.getSelectedIndex();
            pedido.agregarProducto(precios[opcion]);
            txtPedido.append(platos[opcion] + "   $" + precios[opcion] + "\n");
            txtTotal.setText(String.valueOf(pedido.getTotal()));
        }
        if (e.getSource() == btnFinalizar) {
            JOptionPane.showMessageDialog(this,
                    "Total a pagar: $" + pedido.getTotal());
        }
        if (e.getSource() == btnNuevo) {
            pedido.reiniciarPedido();
            txtPedido.setText("");
            txtTotal.setText("0");
        }
    }
}