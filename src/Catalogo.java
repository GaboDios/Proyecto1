import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Producto> productos;

    // Constructor
    public Catalogo() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al catálogo
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del catálogo
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para obtener la lista de productos del catálogo
    public List<Producto> obtenerProductos() {
        return productos;
    }

    // Método para buscar un producto por su código de barras
    public Producto buscarProductoPorCodigo(String codigoBarras) {
        for (Producto producto : productos) {
            if (producto.getCodigoBarras().equals(codigoBarras)) {
                return producto;
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    // Método para mostrar todos los productos en el catálogo
    public void mostrarCatalogo() {
        if (productos.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (Producto producto : productos) {
                producto.mostrarDetalles();
                System.out.println();
            }
        }
    }
}
