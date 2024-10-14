import java.util.ArrayList;
import java.util.List;

public class ColeccionProductos {
    private List<Producto> productos;

    // Constructor
    public ColeccionProductos() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto a la colección
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para obtener un iterador de productos
    public ProductoIterator crearIterator() {
        return new ProductoIterator(productos);
    }
}
