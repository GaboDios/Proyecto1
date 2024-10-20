import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * La clase CarritoCompras representa un carrito de compras que contiene una lista de productos.
 * Permite agregar, eliminar, mostrar y calcular el total de los productos en el carrito.
 * Implementa la interfaz Iterable para permitir la iteración sobre los productos del carrito.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class CarritoCompras implements Iterable<Producto>{
    private List<Producto> productos;

    /**
     * Constructor que inicializa un carrito de compras vacío.
     */
    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al carrito de compras.
     *
     * @param producto El producto que se desea agregar al carrito.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }

    /**
     * Elimina un producto del carrito de compras.
     * Si el producto no se encuentra en el carrito, muestra un mensaje indicando que no fue encontrado.
     *
     * @param producto El producto que se desea eliminar del carrito.
     */
    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado del carrito: " + producto.getNombre());
        } else {
            System.out.println("Producto no encontrado en el carrito.");
        }
    }

    /**
     * Calcula el total de todos los productos en el carrito.
     *
     * @return El valor total de los productos en el carrito.
     */
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    /**
     * Muestra todos los productos en el carrito de compras, incluidos sus detalles y el total.
     * Si el carrito está vacío, muestra un mensaje indicando que está vacío.
     */
    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("El carrito esta vacio.");
        } else {
            System.out.println("Productos en el carrito:");
            for (Producto producto : productos) {
                producto.mostrarDetalles();
                System.out.println();
            }
            System.out.println("Total: $" + calcularTotal());
        }
    }

    /**
     * Vacía todos los productos del carrito de compras.
     */
    public void vaciarCarrito() {
        productos.clear();
        System.out.println("El carrito ha sido vaciado.");
    }

    /**
     * Obtiene la lista de productos en el carrito de compras.
     *
     * @return Una lista con los productos del carrito.
     */
    public List<Producto> obtenerProductos() {
        return productos;
    }

    /**
     * Devuelve un iterador sobre los productos del carrito de compras.
     *
     * @return Un objeto Iterator que permite iterar sobre los productos en el carrito.
     */
    @Override
    public Iterator<Producto> iterator() {
        return productos.iterator();
    }
}
