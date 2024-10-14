import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;

    // Constructor
    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }

    // Método para eliminar un producto del carrito
    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado del carrito: " + producto.getNombre());
        } else {
            System.out.println("Producto no encontrado en el carrito.");
        }
    }

    // Método para calcular el total del carrito
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Método para mostrar los productos en el carrito
    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                producto.mostrarDetalles();
                System.out.println();
            }
            System.out.println("Total: $" + calcularTotal());
        }
    }

    // Método para vaciar el carrito
    public void vaciarCarrito() {
        productos.clear();
        System.out.println("El carrito ha sido vaciado.");
    }

    // Método para obtener la lista de productos en el carrito
    public List<Producto> obtenerProductos() {
        return productos;
    }
}
