import java.util.List;
import java.util.Set;

public class CatalogoProxy implements ICatalogo{
    private ICatalogo catalogoReal;
    private boolean accesoPermitido;

    // Constructor
    public CatalogoProxy() {
        this.catalogoReal = Catalogo.getInstancia(); // Usar la instancia Singleton de Catalogo
        this.accesoPermitido = false; // El acceso está restringido inicialmente
    }

    // Método para autenticar el acceso al catálogo
    public void autenticar(Cliente cliente, String usuario, String contrasenia) {
        // Simulación de una validación simple de credenciales
        if (cliente.getNombreUsuario().equals(usuario) && cliente.getContrasenia().equals(contrasenia)) {
            this.accesoPermitido = true;
            System.out.println("Autenticación exitosa. Acceso permitido al catálogo.");
        } else {
            this.accesoPermitido = false;
            System.out.println("Autenticación fallida. Acceso denegado al catálogo.");
        }
    }

    // Método para obtener los departamentos si se tiene acceso
    @Override
    public Set<String> obtenerDepartamentos() {
        if (accesoPermitido) {
            return catalogoReal.obtenerDepartamentos();
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver los departamentos.");
            return null;
        }
    }

    // Método para obtener productos por departamento si se tiene acceso
    @Override
    public List<Producto> obtenerProductosPorDepartamento(String departamento) {
        if (accesoPermitido) {
            return catalogoReal.obtenerProductosPorDepartamento(departamento);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver productos.");
            return null;
        }
    }

    // Método para buscar un producto por su código de barras si se tiene acceso
    @Override
    public Producto buscarProductoPorCodigo(String codigoBarras) {
        if (accesoPermitido) {
            return catalogoReal.buscarProductoPorCodigo(codigoBarras);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para buscar productos.");
            return null;
        }
    }

    @Override
    public List<Producto> obtenerProductos() {
        if (accesoPermitido) {
            return catalogoReal.obtenerProductos();
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver los productos.");
            return null;
        }
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new UnsupportedOperationException("Operación no permitida: No se pueden agregar productos a través del proxy.");
    }

    @Override
    public void eliminarProducto(Producto producto) {
        throw new UnsupportedOperationException("Operación no permitida: No se pueden eliminar productos a través del proxy.");
    }

}
