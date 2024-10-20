import java.util.List;
import java.util.Set;

/**
 * La clase CatalogoProxy es un proxy que controla el acceso al catalogo real.
 * El acceso al catalogo esta restringido y requiere autenticacion.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class CatalogoProxy implements ICatalogo{
    private ICatalogo catalogoReal;
    private boolean accesoPermitido;

    /**
     * Constructor que inicializa el proxy con la instancia Singleton del catalogo real.
     * El acceso al catalogo esta restringido inicialmente.
     */
    public CatalogoProxy() {
        this.catalogoReal = Catalogo.getInstancia();
        this.accesoPermitido = false;
    }

    /**
     * Metodo para autenticar el acceso al catalogo.
     * Verifica las credenciales del cliente antes de permitir el acceso al catalogo.
     *
     * @param cliente     El cliente que intenta acceder al catalogo.
     * @param usuario     El nombre de usuario proporcionado.
     * @param contrasenia La contrasenia proporcionada.
     */
    public void autenticar(Cliente cliente, String usuario, String contrasenia) {
        if (cliente.getNombreUsuario().equals(usuario) && cliente.getContrasenia().equals(contrasenia)) {
            this.accesoPermitido = true;
            System.out.println("Autenticacion exitosa. Acceso permitido al catalogo.");
        } else {
            this.accesoPermitido = false;
            System.out.println("Autenticacion fallida. Acceso denegado al catalogo.");
        }
    }

    /**
     * Metodo para obtener los departamentos si se tiene acceso.
     * Si el acceso esta permitido, se delega la operacion al catalogo real.
     *
     * @return Un conjunto de nombres de departamentos o null si el acceso es denegado.
     */
    @Override
    public Set<String> obtenerDepartamentos() {
        if (accesoPermitido) {
            return catalogoReal.obtenerDepartamentos();
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver los departamentos.");
            return null;
        }
    }

    /**
     * Metodo para obtener los productos por departamento si se tiene acceso.
     * Si el acceso esta permitido, se delega la operacion al catalogo real.
     *
     * @param departamento El nombre del departamento del cual se desea obtener los productos.
     * @return Una lista de productos del departamento o null si el acceso es denegado.
     */
    @Override
    public List<Producto> obtenerProductosPorDepartamento(String departamento) {
        if (accesoPermitido) {
            return catalogoReal.obtenerProductosPorDepartamento(departamento);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver productos.");
            return null;
        }
    }

    /**
     * Metodo para buscar un producto por su codigo de barras si se tiene acceso.
     * Si el acceso esta permitido, se delega la operacion al catalogo real.
     *
     * @param codigoBarras El codigo de barras del producto que se desea buscar.
     * @return El producto encontrado o null si el acceso es denegado.
     */
    @Override
    public Producto buscarProductoPorCodigo(String codigoBarras) {
        if (accesoPermitido) {
            return catalogoReal.buscarProductoPorCodigo(codigoBarras);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para buscar productos.");
            return null;
        }
    }

    /**
     * Metodo para obtener todos los productos si se tiene acceso.
     * Si el acceso esta permitido, se delega la operacion al catalogo real.
     *
     * @return Una lista de productos del catalogo o null si el acceso es denegado.
     */
    @Override
    public List<Producto> obtenerProductos() {
        if (accesoPermitido) {
            return catalogoReal.obtenerProductos();
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver los productos.");
            return null;
        }
    }

    /**
     * Operacion no permitida para agregar productos a traves del proxy.
     * Lanza una excepcion UnsupportedOperationException.
     *
     * @param producto El producto que se intenta agregar.
     */
    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("Operacion no permitida: No se pueden agregar productos a traves del proxy.");
    }

    /**
     * Operacion no permitida para eliminar productos a traves del proxy.
     * Lanza una excepcion UnsupportedOperationException.
     *
     * @param producto El producto que se intenta eliminar.
     */
    @Override
    public void eliminarProducto(Producto producto) {
        throw new UnsupportedOperationException("Operacion no permitida: No se pueden eliminar productos a traves del proxy.");
    }

}
