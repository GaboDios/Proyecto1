import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * La clase Catalogo implementa la interfaz ICatalogo y representa un catalogo de productos.
 * Utiliza el patrón Singleton para asegurar que solo exista una instancia del catalogo.
 * Los productos pueden ser agregados, eliminados, buscados, y filtrados por departamento.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class Catalogo implements ICatalogo{
    private static Catalogo instanciaUnica;
    private List<Producto> productos;

    /**
     * Constructor privado para impedir la creación de instancias adicionales.
     * Inicializa la lista de productos.
     */
    private Catalogo() {
        this.productos = new ArrayList<>();
    }

    /**
     * Metodo estatico que devuelve la unica instancia del catalogo.
     * Si no existe, se crea una nueva instancia y se rellena con productos mediante la clase CatalogoFactory.
     *
     * @return La instancia unica del catalogo.
     */
    public static synchronized Catalogo getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Catalogo();
            CatalogoFactory.poblarCatalogo(instanciaUnica);
        }
        return instanciaUnica;
    }

    /**
     * Agrega un producto al catalogo.
     *
     * @param producto El producto que se desea agregar al catálogo.
     */
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Elimina un producto del catalogo.
     *
     * @param producto El producto que se desea eliminar del catálogo.
     */
    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    /**
     * Devuelve la lista de productos en el catalogo.
     *
     * @return Una lista de productos disponibles en el catálogo.
     */
    @Override
    public List<Producto> obtenerProductos() {
        return productos;
    }

    /**
     * Busca un producto en el catalogo por su codigo de barras.
     *
     * @param codigoBarras El codigo de barras del producto que se desea buscar.
     * @return El producto si se encuentra en el catalogo, de lo contrario, devuelve null.
     */
    @Override
    public Producto buscarProductoPorCodigo(String codigoBarras) {
        for (Producto producto : productos) {
            if (producto.getCodigoBarras().equalsIgnoreCase(codigoBarras)) {
                return producto;
            }
        }
        System.out.println("Producto no encontrado.");
        return null;
    }

    /**
     * Obtiene un conjunto unico de departamentos presentes en el catalogo.
     *
     * @return Un conjunto de departamentos sin duplicados.
     */
    @Override
    public Set<String> obtenerDepartamentos() {
        Set<String> departamentos = new HashSet<>();
        for (Producto producto : productos) {
            departamentos.add(producto.getDepartamento());
        }
        return departamentos;
    }

    /**
     * Devuelve una lista de productos pertenecientes a un departamento especifico.
     *
     * @param departamento El nombre del departamento que se desea filtrar.
     * @return Una lista de productos que pertenecen al departamento especificado.
     */
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
