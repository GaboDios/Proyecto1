import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Catalogo implements ICatalogo{
    private static Catalogo instanciaUnica;
    private List<Producto> productos;

    // Constructor
    private Catalogo() {
        this.productos = new ArrayList<>();
    }

    public static synchronized Catalogo getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Catalogo();
            // Poblar el catálogo la primera vez que se crea la instancia
            CatalogoFactory.poblarCatalogo(instanciaUnica);// Se crea solo la primera vez que se solicita
        }
        return instanciaUnica;
    }

    // Método para agregar un producto al catálogo
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del catálogo
    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para obtener la lista de productos del catálogo
    @Override
    public List<Producto> obtenerProductos() {
        return productos;
    }

    // Método para buscar un producto por su código de barras
    @Override
    public Producto buscarProductoPorCodigo(String codigoBarras) {
        for (Producto producto : productos) {
            if (producto.getCodigoBarras().equalsIgnoreCase(codigoBarras)) {
                return producto;
            }
        }
        System.out.println("Producto no encontrado.");
        return null; // Devuelve null si no se encuentra el producto
    }


    // Método para obtener los departamentos únicos en el catálogo
    @Override
    public Set<String> obtenerDepartamentos() {
        Set<String> departamentos = new HashSet<>();
        for (Producto producto : productos) {
            departamentos.add(producto.getDepartamento());
        }
        return departamentos; // Devuelve los departamentos sin duplicados
    }

    // Método para obtener productos por departamento
    @Override
    public List<Producto> obtenerProductosPorDepartamento(String departamento) {
        List<Producto> productosDepartamento = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getDepartamento().equalsIgnoreCase(departamento)) {
                productosDepartamento.add(producto);
            }
        }
        return productosDepartamento;
    }
}
