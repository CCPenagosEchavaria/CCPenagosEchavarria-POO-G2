public class Pedido {
    private double total;
    public Pedido() {
        total = 0;
    }

    public void agregarProducto(double precio) {
        total += precio;
    }

    public double getTotal() {
        return total;
    }

    public void reiniciarPedido() {
        total = 0;
    }
}