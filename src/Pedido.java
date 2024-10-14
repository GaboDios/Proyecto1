import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private String direccionEntrega;
    private double total;

    // Constructor privado para evitar instanciación directa
    public Pedido(List<Producto> productos, String direccionEntrega, double total) {
        this.productos = productos;
        this.direccionEntrega = direccionEntrega;
        this.total = total;
    }

    // Método para mostrar los detalles del pedido
    public void mostrarDetallesPedido() {
        System.out.println("Detalles del Pedido:");
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " ($" + producto.getPrecio() + ")");
        }
        System.out.println("Total: $" + total);
    }

    // Getters
    public List<Producto> getProductos() {
        return productos;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public double getTotal() {
        return total;
    }
}
