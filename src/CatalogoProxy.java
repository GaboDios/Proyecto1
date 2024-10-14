public class CatalogoProxy extends Catalogo {
    private Catalogo catalogoReal;
    private boolean accesoPermitido;

    // Constructor
    public CatalogoProxy(Catalogo catalogoReal) {
        this.catalogoReal = catalogoReal;
        this.accesoPermitido = false; // El acceso está restringido inicialmente
    }

    // Método para autenticar el acceso al catálogo
    public void autenticar(String usuario, String contraseña) {
        // Simulación de una validación simple de credenciales
        if (usuario.equals("admin") && contraseña.equals("admin123")) {
            this.accesoPermitido = true;
            System.out.println("Autenticación exitosa. Acceso permitido al catálogo.");
        } else {
            this.accesoPermitido = false;
            System.out.println("Autenticación fallida. Acceso denegado al catálogo.");
        }
    }

    // Método para mostrar el catálogo si se tiene acceso
    @Override
    public void mostrarCatalogo() {
        if (accesoPermitido) {
            catalogoReal.mostrarCatalogo();
        } else {
            System.out.println("Acceso denegado. No tiene permiso para ver el catálogo.");
        }
    }

    // Método para agregar un producto al catálogo si se tiene acceso
    @Override
    public void agregarProducto(Producto producto) {
        if (accesoPermitido) {
            catalogoReal.agregarProducto(producto);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para agregar productos.");
        }
    }

    // Método para eliminar un producto del catálogo si se tiene acceso
    @Override
    public void eliminarProducto(Producto producto) {
        if (accesoPermitido) {
            catalogoReal.eliminarProducto(producto);
        } else {
            System.out.println("Acceso denegado. No tiene permiso para eliminar productos.");
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
}
