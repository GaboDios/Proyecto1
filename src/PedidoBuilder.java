import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private List<Producto> productos;
    private String direccionEntrega;
    private double total;

    // Constructor
    public PedidoBuilder() {
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    // Método para agregar productos al pedido
    public PedidoBuilder agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
        return this; // Retorna el builder para encadenar métodos
    }

    // Método para establecer la dirección de entrega
    public PedidoBuilder establecerDireccion(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
        return this; // Retorna el builder para encadenar métodos
    }

    // Método para construir el pedido final
    public Pedido construir() {
        return new Pedido(productos, direccionEntrega, total);
    }
}
